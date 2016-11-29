package com.yxb.baihui.baihui.Toutiaonews.view;

import com.yxb.baihui.baihui.Toutiaonews.bean.ToutiaonewsBean;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public interface ToutiaonewsView {

    void showProgress();

    void addNews(List<ToutiaonewsBean> newsList);

    void hideProgress();

    void showLoadFailMsg();
}
