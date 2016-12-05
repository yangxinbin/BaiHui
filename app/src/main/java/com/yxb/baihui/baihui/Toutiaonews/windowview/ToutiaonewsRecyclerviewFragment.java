package com.yxb.baihui.baihui.Toutiaonews.windowview;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yxb.baihui.baihui.R;
import com.yxb.baihui.baihui.Toutiaonews.ToutiaonewsAdapter;
import com.yxb.baihui.baihui.Toutiaonews.bean.ToutiaonewsBean;
import com.yxb.baihui.baihui.Toutiaonews.presenter.ToutiaonewsPresenter;
import com.yxb.baihui.baihui.Toutiaonews.presenter.ToutiaonewsPresenterImpl;
import com.yxb.baihui.baihui.Toutiaonews.view.ToutiaonewsView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ToutiaonewsRecyclerviewFragment extends Fragment implements ToutiaonewsView, SwipeRefreshLayout.OnRefreshListener {

    @Bind(R.id.recycle_view)
    RecyclerView recycleView;
    @Bind(R.id.swipe_refresh_widget)
    SwipeRefreshLayout swipeRefreshWidget;
    private ToutiaonewsPresenter mNewsPresenter;
    private int mType = ToutiaonewsFragment.NEWS_TYPE_TOPNEWS;
    private List<ToutiaonewsBean> mData;
    private LinearLayoutManager mLayoutManager;
    private ToutiaonewsAdapter adapter;


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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_toutiaonews_recyclerview, null);
        ButterKnife.bind(this, view);
        swipeRefreshWidget.setColorSchemeResources(R.color.colorPrimary,
                R.color.colorPrimaryDark, R.color.colorPrimary,
                R.color.colorPrimaryDark);
        swipeRefreshWidget.setOnRefreshListener(this);
        recycleView.setHasFixedSize(true);//固定宽高
        mLayoutManager = new LinearLayoutManager(getActivity());
        recycleView.setLayoutManager(mLayoutManager);
        recycleView.setItemAnimator(new DefaultItemAnimator());//设置默认动画
        adapter = new ToutiaonewsAdapter(getActivity().getApplicationContext());
        adapter.setOnItemnewsClickListener(mOnItemClickListener);
        recycleView.setAdapter(adapter);
        recycleView.addOnScrollListener(mOnScrollListener);
        return view;
    }

    private ToutiaonewsAdapter.OnItemnewsClickListener mOnItemClickListener = new ToutiaonewsAdapter.OnItemnewsClickListener() {
        @Override
        public void onItemClick(View view, int position) {
            if (mData.size() <= 0) {
                return;
            }
            ToutiaonewsBean news = adapter.getItem(position);
            Intent intent = new Intent(getActivity(), ToutiaonewsDetailActivity.class);
            intent.putExtra("news", news);

//            View transitionView = view.findViewById(R.id.ivNews);
//            ActivityOptionsCompat options =
//                    ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),
//                            transitionView, getString(R.string.transition_news_img));
//
//            ActivityCompat.startActivity(getActivity(), intent, options.toBundle());
        }
    };
    private RecyclerView.OnScrollListener mOnScrollListener = new RecyclerView.OnScrollListener() {

        private int lastVisibleItem;

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            lastVisibleItem = mLayoutManager.findLastVisibleItemPosition();//可见的最后一个item
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == RecyclerView.SCROLL_STATE_IDLE
                    && lastVisibleItem + 1 == adapter.getItemCount()
                    && adapter.isShowFooter()) {//加载判断条件 手指离开屏幕 到了footeritem
                //加载更多
                mNewsPresenter.loadNews(mType);
                Log.v("jjjjjjjjjjjjjjjj", "------loadNews-----");

            }
        }
    };

    @Override
    public void showProgress() {
        swipeRefreshWidget.setRefreshing(true);
    }

    @Override
    public void addNews(List<ToutiaonewsBean> newsList) {
        Log.v("jjjjjjjjjjjjjjjj", "------newsList-----"+newsList.size());
        adapter.isShowFooter(true);
        if (mData == null) {
            mData = new ArrayList<ToutiaonewsBean>();
        }
        mData.addAll(newsList);
        Log.v("jjjjjjjjjjjjjjjj", "------mData-----"+mData.size());
        adapter.setmDate(mData);
        //如果没有更多数据了,则隐藏footer布局
        if (newsList == null || newsList.size() == 0) {
            adapter.isShowFooter(false);
        }
        adapter.notifyDataSetChanged();

    }

    @Override
    public void hideProgress() {
        swipeRefreshWidget.setRefreshing(false);
    }

    @Override
    public void showLoadFailMsg() {
        View view = getActivity() == null ? recycleView.getRootView() : getActivity().findViewById(R.id.drawer_layout);
        if (isAdded()) {
            Snackbar.make(view, getResources().getString(R.string.load_fail), Snackbar.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void onRefresh() {
        if (mData != null) {
            mData.clear();
        }
        Log.v("jjjjjjjjjjjjjjjj", "------onRefresh-----");
        mNewsPresenter.loadNews(mType);
    }
}
