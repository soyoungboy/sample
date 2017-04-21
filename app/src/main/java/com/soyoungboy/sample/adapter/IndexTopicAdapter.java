package com.soyoungboy.sample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.soyoungboy.sample.R;
import com.soyoungboy.sample.bean.Topic;
import com.soyoungboy.sample.utils.ImageUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * 首页热门话题
 */
public class IndexTopicAdapter
    extends RecyclerView.Adapter<IndexTopicAdapter.ViewHolder> implements View.OnClickListener {

    private Context mContext;
    private List<Topic.DataBeanXXX.TopicListInfoLayoutBean.DataBeanX> mLists = new ArrayList<>();

    private OnRecyclerViewItemClickListener mOnItemClickListener;

    public IndexTopicAdapter(Context context, List<Topic.DataBeanXXX.TopicListInfoLayoutBean.DataBeanX> lists) {
        this.mContext = context;
        this.mLists = lists;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public IndexTopicAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.index_fragment_topic_item, null);
        ViewHolder holder = new ViewHolder(view);
        if (view != null) {
            view.setOnClickListener(this);
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(final IndexTopicAdapter.ViewHolder holder, int position) {
        Topic.DataBeanXXX.TopicListInfoLayoutBean.DataBeanX topicListInfo = mLists.get(position);
        if (position == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) holder.mLayBg.getLayoutParams();
            layoutParams.setMargins(mContext.getResources().getDimensionPixelSize(R.dimen.value_12dp), 0, mContext.getResources().getDimensionPixelSize(R.dimen.value_8dp), 0);
        }
        holder.mTvName.setText(topicListInfo.getTopic().getName());
        holder.mTvTopicNum.setText(String.format("%d人参与", topicListInfo.getTotalCountHot()));
        ImageUtils.loadImage(mContext, 320, 170, topicListInfo.getTopic().getImg_url(),
                R.drawable.background_d7d7d7, holder.mImgBg);
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mLists.size();
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick((int) v.getTag());
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTvName;
        private TextView mTvTopicNum;
        private ImageView mImgBg;
        private RelativeLayout mLayBg;

        public ViewHolder(View view) {
            super(view);
            mLayBg = (RelativeLayout) view.findViewById(R.id.lay_bg);
            mTvName = (TextView) view.findViewById(R.id.tv_topic_title);
            mTvTopicNum = (TextView) view.findViewById(R.id.tv_topic_num);
            mImgBg = (ImageView) view.findViewById(R.id.img_bg);
        }
    }

    public interface OnRecyclerViewItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

}
