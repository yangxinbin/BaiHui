package com.yxb.baihui.baihui.Toutiaonews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.yxb.baihui.baihui.Toutiaonews.bean.ToutiaonewsBean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/1 0001.
 */

public class ToutiaonewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context context;
    private OnItemnewsClickListener mOnItemnewsClickListener;//自注册的接口给调用者用于点击逻辑
    private List<ToutiaonewsBean> mData;


    public ToutiaonewsAdapter(Context context) {
        this.context=context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public ToutiaonewsBean getItem(int position) {
        return mData == null ? null : mData.get(position);
    }
    public void setOnItemnewsClickListener(OnItemnewsClickListener onItemnewsClickListener) {
        this.mOnItemnewsClickListener = onItemnewsClickListener;
    }
    public interface OnItemnewsClickListener {
        public void onItemClick(View view, int position);
    }

}
