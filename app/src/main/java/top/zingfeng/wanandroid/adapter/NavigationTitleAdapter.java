package top.zingfeng.wanandroid.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.network.bean.SystemArticleBean;

/**
 * @author zingfeng
 * @date On 2021/2/14
 */
public class NavigationTitleAdapter extends BaseQuickAdapter<SystemArticleBean.DataBean, BaseViewHolder> {

    public NavigationTitleAdapter(int layoutResId, @Nullable List<SystemArticleBean.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, SystemArticleBean.DataBean systemBean) {
        StringBuilder content = new StringBuilder();
        for (SystemArticleBean.DataBean.ChildrenBean childrenBean: systemBean.getChildren()){
            String name = childrenBean.getName();
            content.append(name).append("    ");
        }
        baseViewHolder.setText(R.id.tv_title, systemBean.getName());
        baseViewHolder.setText(R.id.tv_content, content.toString());
    }
}
