package com.yxb.baihui.baihui.startapp;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.transition.Explode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yxb.baihui.baihui.R;
import com.yxb.baihui.baihui.mainpage.windowview.MainpageActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.listener.SaveListener;


public class MobileLoginActivity extends AppCompatActivity {

    @Bind(R.id.phone_username)
    EditText phoneusername;
    @Bind(R.id.phone_password)
    EditText phonepassword;
    @Bind(R.id.checknumber_get)
    Button checknumberget;
    @Bind(R.id.phone_go)
    Button phonego;
    @Bind(R.id.phone_cv)
    CardView phonecv;
    @Bind(R.id.phone_fab)
    FloatingActionButton phonefab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobilelogin_main);
        ButterKnife.bind(this);


    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @OnClick({R.id.phone_go, R.id.phone_fab,R.id.checknumber_get})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.checknumber_get:

                break;
            case R.id.phone_go:

                break;
            case R.id.phone_fab:
                getWindow().setExitTransition(null);
                getWindow().setEnterTransition(null);
                finish();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(this, phonefab, phonefab.getTransitionName());
                    startActivity(new Intent(this, RegisterActivity.class), options.toBundle());
                } else {
                    startActivity(new Intent(this, RegisterActivity.class));
                }
                break;

        }
    }
}
