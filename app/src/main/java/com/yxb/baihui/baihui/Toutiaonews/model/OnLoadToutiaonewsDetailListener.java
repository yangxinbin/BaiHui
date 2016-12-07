package com.yxb.baihui.baihui.Toutiaonews.model;

import com.yxb.baihui.baihui.Toutiaonews.bean.ToutiaonewsDetailBean;

/**
 * Created by Administrator on 2016/12/7 0007.
 */

public interface OnLoadToutiaonewsDetailListener {

    void onSuccess(ToutiaonewsDetailBean newsDetailBean);

    void onFailure(String msg, Exception e);
}
