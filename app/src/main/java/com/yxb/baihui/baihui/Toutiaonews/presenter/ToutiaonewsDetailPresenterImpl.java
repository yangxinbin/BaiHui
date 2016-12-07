package com.yxb.baihui.baihui.Toutiaonews.presenter;

import android.content.Context;

import com.yxb.baihui.baihui.Toutiaonews.bean.ToutiaonewsDetailBean;
import com.yxb.baihui.baihui.Toutiaonews.model.OnLoadToutiaonewsDetailListener;
import com.yxb.baihui.baihui.Toutiaonews.model.ToutiaonewsModel;
import com.yxb.baihui.baihui.Toutiaonews.model.ToutiaonewsModelImpl;
import com.yxb.baihui.baihui.Toutiaonews.view.ToutiaonewsDetailView;

/**
 * Created by Administrator on 2016/12/7 0007.
 */

public class ToutiaonewsDetailPresenterImpl implements ToutiaonewsDetailPresenter, OnLoadToutiaonewsDetailListener {
    private ToutiaonewsDetailView toutiaonewsDetailView;
    private Context context;
    private ToutiaonewsModel toutiaonewsModel;

    public ToutiaonewsDetailPresenterImpl(Context mContent, ToutiaonewsDetailView toutiaonewsDetailView) {
        this.toutiaonewsDetailView = toutiaonewsDetailView;
        this.context = mContent;
        toutiaonewsModel = new ToutiaonewsModelImpl();
    }

    @Override
    public void loadNewsDetail(String url) {
        toutiaonewsDetailView.showProgress();
        toutiaonewsModel.loadNewsDetail(url, this);
    }

    @Override
    public void onSuccess(String newsurl) {
        if (newsurl != "") {
            toutiaonewsDetailView.showNewsDetialContent(newsurl);
        }
        toutiaonewsDetailView.hideProgress();
    }

    @Override
    public void onFailure(String msg, Exception e) {
        toutiaonewsDetailView.hideProgress();
    }
}
