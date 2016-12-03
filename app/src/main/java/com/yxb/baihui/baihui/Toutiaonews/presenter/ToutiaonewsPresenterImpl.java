package com.yxb.baihui.baihui.Toutiaonews.presenter;

import com.yxb.baihui.baihui.Toutiaonews.model.ToutiaonewsModel;
import com.yxb.baihui.baihui.Toutiaonews.model.ToutiaonewsModelImpl;
import com.yxb.baihui.baihui.Toutiaonews.view.ToutiaonewsView;

/**
 * Created by Administrator on 2016/11/29 0029.
 */

public class ToutiaonewsPresenterImpl implements ToutiaonewsPresenter {

    private ToutiaonewsView toutiaonewsView;
    private ToutiaonewsModel toutiaonewsModel;

    public ToutiaonewsPresenterImpl(ToutiaonewsView toutiaonewsView) {
        this.toutiaonewsView = toutiaonewsView;
        this.toutiaonewsModel = new ToutiaonewsModelImpl();
    }

    @Override
    public void loadNews(int type) {

    }
}
