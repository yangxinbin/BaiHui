package com.yxb.baihui.baihui.Toutiaonews.presenter;

import com.yxb.baihui.baihui.Toutiaonews.bean.ToutiaonewsBean;
import com.yxb.baihui.baihui.Toutiaonews.model.OnLoadToutiaonewsListListener;
import com.yxb.baihui.baihui.Toutiaonews.model.ToutiaonewsModel;
import com.yxb.baihui.baihui.Toutiaonews.model.ToutiaonewsModelImpl;
import com.yxb.baihui.baihui.Toutiaonews.view.ToutiaonewsView;
import com.yxb.baihui.baihui.Toutiaonews.windowview.ToutiaonewsFragment;
import com.yxb.baihui.baihui.urls.Urls;

import java.util.List;

/**
 * Created by Administrator on 2016/11/29 0029.
 */

public class ToutiaonewsPresenterImpl implements ToutiaonewsPresenter,OnLoadToutiaonewsListListener{

    private ToutiaonewsView toutiaonewsView;
    private ToutiaonewsModel toutiaonewsModel;

    public ToutiaonewsPresenterImpl(ToutiaonewsView toutiaonewsView) {
        this.toutiaonewsView = toutiaonewsView;
        this.toutiaonewsModel = new ToutiaonewsModelImpl();
    }

    @Override
    public void loadNews(int type) {
        String url = getUrl(type);
        //刷新的时候才显示刷新进度条
        //toutiaonewsView.showProgress();
        toutiaonewsModel.loadNews(url, type, this);
    }

    private String getUrl(int type) {
        StringBuffer sburl = new StringBuffer();
        switch (type) {
            case ToutiaonewsFragment.NEWS_TYPE_TOPNEWS:
                sburl.append(Urls.HOST_TYPE).append(Urls.TOP_ID);
                break;
            case ToutiaonewsFragment.NEWS_TYPE_SOCIETY:
                sburl.append(Urls.HOST_TYPE).append(Urls.SHEHUI_ID);
                break;
            case ToutiaonewsFragment.NEWS_TYPE_DOMESTIC:
                sburl.append(Urls.HOST_TYPE).append(Urls.GUOMEI_ID);
                break;
            case ToutiaonewsFragment.NEWS_TYPE_INTERNATIONAL:
                sburl.append(Urls.HOST_TYPE).append(Urls.GUOJI_ID);
                break;
            case ToutiaonewsFragment.NEWS_TYPE_ENTERTAINMENT:
                sburl.append(Urls.HOST_TYPE).append(Urls.YULE_ID);
                break;
            case ToutiaonewsFragment.NEWS_TYPE_SPORTS:
                sburl.append(Urls.HOST_TYPE).append(Urls.TIYU_ID);
                break;
            case ToutiaonewsFragment.NEWS_TYPE_MILITARY:
                sburl.append(Urls.HOST_TYPE).append(Urls.JUNSHI_ID);
                break;
            case ToutiaonewsFragment.NEWS_TYPE_SCIENCE:
                sburl.append(Urls.HOST_TYPE).append(Urls.KEJI_ID);
                break;
            case ToutiaonewsFragment.NEWS_TYPE_FINANCE:
                sburl.append(Urls.HOST_TYPE).append(Urls.CAIJING_ID);
                break;
            case ToutiaonewsFragment.NEWS_TYPE_FASHION:
                sburl.append(Urls.HOST_TYPE).append(Urls.SHISHANG_ID);
                break;
            default:
                sburl.append(Urls.HOST_TYPE).append(Urls.TOP_ID);
                break;
        }
        sburl.append(Urls.END_URL);
        return sburl.toString();
    }

    @Override
    public void onSuccess(List<ToutiaonewsBean> list) {
        toutiaonewsView.hideProgress();
        toutiaonewsView.addNews(list);
    }

    @Override
    public void onFailure(String msg, Exception e) {
        toutiaonewsView.hideProgress();
        toutiaonewsView.showLoadFailMsg();
    }
}
