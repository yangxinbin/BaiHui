package com.yxb.baihui.baihui.weathernews.presenter;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.View;

import com.yxb.baihui.baihui.weathernews.bean.WeathernewsBean;
import com.yxb.baihui.baihui.weathernews.model.WeathernewsModel;
import com.yxb.baihui.baihui.weathernews.model.WeathernewsModelImpl;
import com.yxb.baihui.baihui.weathernews.view.WeathernewsView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/21 0021.
 */

public class WeathernewsPresenterImpl implements WeathernewsPresenter, WeathernewsModelImpl.LoadWeatherListener {

    private WeathernewsView mWeatherView;
    private WeathernewsModel mWeatherModel;
    private Context mContext;

    public WeathernewsPresenterImpl(Context context, WeathernewsView weatherView) {
        this.mContext = context;
        this.mWeatherView = weatherView;
        mWeatherModel = new WeathernewsModelImpl();
    }

    @Override
    public void loadWeatherData() {
        mWeatherView.showProgress();
        if (!isNetworkAvailable(mContext)) {
            mWeatherView.hideProgress();
            mWeatherView.showErrorToast("无网络连接");
            Log.v("jjjjjjjj", "-------------isNetworkAvailable-----");
            return;
        }
        WeathernewsModelImpl.LoadLocationListener listener = new WeathernewsModelImpl.LoadLocationListener() {
            @Override
            public void onSuccess(String cityName) {
                //定位成功，获取定位城市天气预报
                mWeatherView.setCity(cityName);
                mWeatherModel.loadWeatherData(cityName, WeathernewsPresenterImpl.this);
            }

            @Override
            public void onFailure(String msg, Exception e) {
                mWeatherView.showErrorToast("定位失败");
                mWeatherView.setCity("深圳");
                Log.v("jjjjjjjj", "-------------深圳-----");
                mWeatherModel.loadWeatherData("深圳", WeathernewsPresenterImpl.this);
            }
        };
        //获取定位信息
        mWeatherModel.loadLocation(mContext, listener);

    }

    @Override
    public void onSuccess(List<WeathernewsBean> list) {

        Log.v("jjjjjjjj", "-------onSuccess-----");

        WeathernewsBean todayWeather = list.get(0);

        mWeatherView.setToday(todayWeather.getResult().getData().getRealtime().getDate());
        mWeatherView.setTime(todayWeather.getResult().getData().getRealtime().getTime());
        mWeatherView.setTemperature(todayWeather.getResult().getData().getRealtime().getWeather().getTemperature());
        mWeatherView.setWeather(todayWeather.getResult().getData().getRealtime().getWeather().getInfo());
        mWeatherView.setWeek(todayWeather.getResult().getData().getWeather().get(0).getWeek());
        mWeatherView.setWind(todayWeather.getResult().getData().getRealtime().getWind().getDirect());
        mWeatherView.setWindPower(todayWeather.getResult().getData().getRealtime().getWind().getPower());
        mWeatherView.setWeatherImage(todayWeather.getResult().getData().getRealtime().getWeather().getImg());

        mWeatherView.setfutureWeatherData(list);
        Log.v("jjjjjjjj", "-------showWeatherLayout------onSuccess-----");
        mWeatherView.hideProgress();
        mWeatherView.showWeatherLayout();

    }

    @Override
    public void onFailure(String msg, Exception e) {
        mWeatherView.hideProgress();
        mWeatherView.showErrorToast("获取天气数据失败");
    }

    /**
     * 判断网络是否可用
     *
     * @param context
     * @return
     */
    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm != null) {
            //如果仅仅是用来判断网络连接
            //则可以使用 cm.getActiveNetworkInfo().isAvailable();
            NetworkInfo[] info = cm.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
