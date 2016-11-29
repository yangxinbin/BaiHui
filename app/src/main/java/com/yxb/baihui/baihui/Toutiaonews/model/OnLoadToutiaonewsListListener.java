package com.yxb.baihui.baihui.Toutiaonews.model;

import com.yxb.baihui.baihui.Toutiaonews.bean.ToutiaonewsBean;

import java.util.List;

/**
 * Description : 新闻列表加载回调
 * Author : AstroGypsophila
 * Github  : https://github.com/AstroGypsophila
 * Date   : 2016/8/28
 */
public interface OnLoadToutiaonewsListListener {

    void onSuccess(List<ToutiaonewsBean> list);

    void onFailure(String msg, Exception e);
}
