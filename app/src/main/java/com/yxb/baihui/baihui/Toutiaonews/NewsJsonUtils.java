package com.yxb.baihui.baihui.Toutiaonews;

import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.yxb.baihui.baihui.Toutiaonews.bean.ToutiaonewsBean;
import com.yxb.baihui.baihui.utils.JsonUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Description :
 * Author : lauren
 * Email  : lauren.liuling@gmail.com
 * Blog   : http://www.liuling123.com
 * Date   : 15/12/19
 */
public class NewsJsonUtils {

    private final static String TAG = "NewsJsonUtils";

    /**
     * 将获取到的json转换为新闻列表对象
     * @param res
     * @param value
     * @return
     */
    public static List<ToutiaonewsBean> readJsonNewsBeans(String res, String value) {
        List<ToutiaonewsBean> beans = new ArrayList<ToutiaonewsBean>();
        try {
            JsonParser parser = new JsonParser();
            JsonObject jsonObj = parser.parse(res).getAsJsonObject();
                if (!jsonObj.has("type")) {
                    ToutiaonewsBean news = JsonUtils.deserialize(jsonObj, ToutiaonewsBean.class);
                   // Log.v("nnnnnnnn","----news-------"+news.getResult().getData().get(1).getTitle());
                    beans.add(news);
                }
        } catch (Exception e) {
        }
        return beans;
    }


}
