package com.yxb.baihui.baihui.Toutiaonews.model;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public interface ToutiaonewsModel {
    void loadNews(String url, int type, OnLoadToutiaonewsListListener listener);
//    void loadNewsDetail(String docid, OnLoadNewsDetailListener listener);
}
