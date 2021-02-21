package top.zingfeng.wanandroid.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.adapter.SearchHistoryAdapter;
import top.zingfeng.wanandroid.adapter.SearchHotAdapter;
import top.zingfeng.wanandroid.db.HistoryDataBean;
import top.zingfeng.wanandroid.db.SearchHistoryDataHelper;
import top.zingfeng.wanandroid.network.BaseRetrofit;
import top.zingfeng.wanandroid.network.bean.HotKeyBean;
import top.zingfeng.wanandroid.network.bean.QueryDataBean;
import top.zingfeng.wanandroid.network.services.SearchService;

/**
 * @author zingfeng
 * @date 2021/02/19
 */
@Route(path = "/view/SearchActivity")
public class SearchActivity extends AppCompatActivity {

    @BindView(R.id.iv_side_nav)
    ImageView mIvSideNav;

    @BindView(R.id.et_search_content)
    EditText mEtSearchContent;

    @BindView(R.id.iv_search)
    ImageView mIvSearch;

    @BindView(R.id.rv_hot_search)
    RecyclerView mRvHotSearch;

    @BindView(R.id.tv_clear_history)
    TextView mTvClearHistory;

    @BindView(R.id.rv_search_history)
    RecyclerView mRvSearchHistory;

    private SearchHotAdapter mSearchHotAdapter;
    private SearchHistoryAdapter mSearchHistoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        initData();
        initEvent();
    }

    private void initData(){
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getBaseContext(), 2);
        mSearchHotAdapter = new SearchHotAdapter(R.layout.item_hot_search, null);
        mRvHotSearch.setLayoutManager(gridLayoutManager);
        mRvHotSearch.setAdapter(mSearchHotAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getBaseContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mSearchHistoryAdapter = new SearchHistoryAdapter(R.layout.item_search_history, null);
        mSearchHistoryAdapter.addChildClickViewIds(R.id.iv_closed);
        mRvSearchHistory.setLayoutManager(linearLayoutManager);
        mRvSearchHistory.setAdapter(mSearchHistoryAdapter);

        Retrofit retrofit = BaseRetrofit.getRetrofit();
        SearchService searchService = retrofit.create(SearchService.class);
        Call<HotKeyBean> hotKeyBeanCall = searchService.hotKey();
        hotKeyBeanCall.enqueue(new Callback<HotKeyBean>() {
            @Override
            public void onResponse(Call<HotKeyBean> call, Response<HotKeyBean> response) {
                List<HotKeyBean.DataBean> data = response.body().getData();
                if (data != null){
                    mSearchHotAdapter.setNewInstance(data);
                    mSearchHotAdapter.setOnItemClickListener((adapter, view, position) -> {
                        String content = data.get(position).getName();
                        ARouter.getInstance()
                                .build("/view/SearchDetailActivity")
                                .withString("titleContent", content)
                                .navigation();
                        SearchHistoryDataHelper searchHistoryDataHelper = new SearchHistoryDataHelper(
                                SearchActivity.this, "app_db", null, 1);
                        SQLiteDatabase writableDatabase = searchHistoryDataHelper.getWritableDatabase();
                        Cursor cursor = writableDatabase.query("search_history", null, "history_name = ?", new String[]{content}, null, null, "id DESC");
                        int count = cursor.getCount();
                        if (count == 0){
                            ContentValues values = new ContentValues();
                            values.put("history_name", content);
                            writableDatabase.insert("search_history", null, values);
                        }
                        cursor.close();
                        writableDatabase.close();
                    });
                }
            }

            @Override
            public void onFailure(Call<HotKeyBean> call, Throwable t) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        SearchHistoryDataHelper searchHistoryDataHelper = new SearchHistoryDataHelper(SearchActivity.this, "app_db",null, 1);
        SQLiteDatabase writableDatabase = searchHistoryDataHelper.getWritableDatabase();
        Cursor cursor = writableDatabase.query("search_history", null, null, null, null, null, "id DESC");
        List<HistoryDataBean> historyDataBeans = new ArrayList<>();
        if (cursor.moveToFirst()){
            do {
                Integer id = cursor.getInt(cursor.getColumnIndex("id"));
                String historyName = cursor.getString(cursor.getColumnIndex("history_name"));
                HistoryDataBean historyDataBean = new HistoryDataBean();
                historyDataBean.setId(id);
                historyDataBean.setName(historyName);
                historyDataBeans.add(historyDataBean);
            } while (cursor.moveToNext());
        }
        cursor.close();
        mSearchHistoryAdapter.setNewInstance(historyDataBeans);
        mSearchHistoryAdapter.notifyDataSetChanged();
    }

    private void initEvent(){
        mIvSideNav.setOnClickListener(v -> finish());
        mIvSearch.setOnClickListener(v -> {
            String content = mEtSearchContent.getText().toString();
            ARouter.getInstance()
                    .build("/view/SearchDetailActivity")
                    .withString("titleContent", content)
                    .navigation();
            SearchHistoryDataHelper searchHistoryDataHelper = new SearchHistoryDataHelper(
                    SearchActivity.this, "app_db", null, 1);
            SQLiteDatabase writableDatabase = searchHistoryDataHelper.getWritableDatabase();
            Cursor cursor = writableDatabase.query("search_history", null, "history_name = ?", new String[]{content}, null, null, "id DESC");
            int count = cursor.getCount();
            if (count == 0){
                ContentValues values = new ContentValues();
                values.put("history_name", content);
                writableDatabase.insert("search_history", null, values);
            }
            cursor.close();
            writableDatabase.close();
        });
        mSearchHistoryAdapter.setOnItemClickListener((adapter, view, position) -> {
            HistoryDataBean content = (HistoryDataBean) adapter.getData().get(position);
            ARouter.getInstance()
                    .build("/view/SearchDetailActivity")
                    .withString("titleContent", content.getName())
                    .navigation();
        });
        mSearchHistoryAdapter.setOnItemChildClickListener((adapter, view, position) -> {
            if (view.getId() == R.id.iv_closed){
                HistoryDataBean content = (HistoryDataBean) adapter.getData().get(position);
                Integer contentId = content.getId();
                SearchHistoryDataHelper searchHistoryDataHelper = new SearchHistoryDataHelper(SearchActivity.this, "app_db",null, 1);
                SQLiteDatabase writableDatabase = searchHistoryDataHelper.getReadableDatabase();
                writableDatabase.execSQL("DELETE FROM search_history WHERE id = " + contentId);
                Cursor cursor = writableDatabase.query("search_history", null, null, null, null, null, "id DESC");
                List<HistoryDataBean> historyDataBeans = new ArrayList<>();
                if (cursor.moveToFirst()){
                    do {
                        Integer id = cursor.getInt(cursor.getColumnIndex("id"));
                        String historyName = cursor.getString(cursor.getColumnIndex("history_name"));
                        HistoryDataBean historyDataBean = new HistoryDataBean();
                        historyDataBean.setId(id);
                        historyDataBean.setName(historyName);
                        historyDataBeans.add(historyDataBean);
                    } while (cursor.moveToNext());
                }
                cursor.close();
                mSearchHistoryAdapter.setNewInstance(historyDataBeans);
                mSearchHistoryAdapter.notifyDataSetChanged();
            }
        });
        mTvClearHistory.setOnClickListener(v -> {
            SearchHistoryDataHelper searchHistoryDataHelper = new SearchHistoryDataHelper(SearchActivity.this, "app_db",null, 1);
            SQLiteDatabase writableDatabase = searchHistoryDataHelper.getReadableDatabase();
            writableDatabase.execSQL("drop table search_history");
            searchHistoryDataHelper.onCreate(writableDatabase);
            mSearchHistoryAdapter.setNewInstance(null);
            mSearchHistoryAdapter.notifyDataSetChanged();
        });
    }
}