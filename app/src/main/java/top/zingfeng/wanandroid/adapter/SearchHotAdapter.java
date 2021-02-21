package top.zingfeng.wanandroid.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.network.bean.HotKeyBean;

/**
 * @author zingfeng
 * @date On 2021/2/19
 */
public class SearchHotAdapter extends BaseQuickAdapter<HotKeyBean.DataBean, BaseViewHolder> {

    public SearchHotAdapter(int layoutResId, @Nullable List<HotKeyBean.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, HotKeyBean.DataBean dataBean) {
        baseViewHolder.setText(R.id.tv_name, dataBean.getName());
    }
}
