package com.yxb.baihui.baihui.Toutiaonews.windowview;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.yxb.baihui.baihui.Toutiaonews.bean.ToutiaonewsBean;
import com.yxb.baihui.baihui.Toutiaonews.presenter.ToutiaonewsPresenter;
import com.yxb.baihui.baihui.Toutiaonews.presenter.ToutiaonewsPresenterImpl;
import com.yxb.baihui.baihui.Toutiaonews.view.ToutiaonewsView;

import java.util.List;

public class ToutiaonewsRecyclerviewFragment extends Fragment implements ToutiaonewsView{

    private ToutiaonewsPresenter mNewsPresenter;
    private int mType = ToutiaonewsFragment.NEWS_TYPE_TOPNEWS;

    public static ToutiaonewsRecyclerviewFragment newInstance(int type) {
        Bundle bundle = new Bundle();
        ToutiaonewsRecyclerviewFragment fragment = new ToutiaonewsRecyclerviewFragment();
        bundle.putInt("type", type);
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNewsPresenter = new ToutiaonewsPresenterImpl(this);
        mType = getArguments().getInt("type");
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void addNews(List<ToutiaonewsBean> newsList) {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showLoadFailMsg() {

    }
}
