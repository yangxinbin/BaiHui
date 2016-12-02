package com.yxb.baihui.baihui.Toutiaonews;

import android.content.Context;
import android.view.View;

/**
 * Created by Administrator on 2016/12/1 0001.
 */

public class ToutiaonewsAdapter {
    private Context context;
    private OnItemnewsClickListener mOnItemnewsClickListener;//自注册的接口给调用者用于点击逻辑

    public ToutiaonewsAdapter(Context context) {
        this.context=context;
    }
    public void setOnItemnewsClickListener(OnItemnewsClickListener onItemnewsClickListener) {
        this.mOnItemnewsClickListener = onItemnewsClickListener;
    }
    public interface OnItemnewsClickListener {
        public void onItemClick(View view, int position);
    }
}
