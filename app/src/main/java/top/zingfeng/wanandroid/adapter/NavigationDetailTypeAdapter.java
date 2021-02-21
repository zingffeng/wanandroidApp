package top.zingfeng.wanandroid.adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.network.bean.NavigationBean;

/**
 * @author zingfeng
 * @date On 2021/2/21
 */
public class NavigationDetailTypeAdapter extends BaseQuickAdapter<NavigationBean.DataBean, BaseViewHolder> {

    private RecyclerView mRvNavTag;
    private NavigationTypeNameAdapter mNavigationTypeNameAdapter;

    public NavigationDetailTypeAdapter(int layoutResId, @Nullable List<NavigationBean.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, NavigationBean.DataBean dataBean) {
        baseViewHolder.setText(R.id.tv_title, dataBean.getName());
        mRvNavTag = baseViewHolder.itemView.findViewById(R.id.rv_nav_tag);
        mNavigationTypeNameAdapter = new NavigationTypeNameAdapter(R.layout.item_type_name, dataBean.getArticles());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mRvNavTag.setLayoutManager(linearLayoutManager);
        mRvNavTag.setAdapter(mNavigationTypeNameAdapter);

        mNavigationTypeNameAdapter.setOnItemClickListener((adapter, view, position) -> {
            NavigationBean.DataBean.ArticlesBean articlesBean = dataBean.getArticles().get(position);
            ARouter.getInstance()
                    .build("/view/ArticleDetailActivity")
                    .withString("url", articlesBean.getLink())
                    .withString("title", articlesBean.getTitle())
                    .navigation();
        });
    }
}
