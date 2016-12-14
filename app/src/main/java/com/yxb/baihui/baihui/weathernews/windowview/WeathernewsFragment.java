package com.yxb.baihui.baihui.weathernews.windowview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yxb.baihui.baihui.R;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public class WeathernewsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather,null);

        return view;
    }
}
