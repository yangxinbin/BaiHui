package com.yxb.baihui.baihui.weathernews.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public class WeathernewsBean {

    /**
     * reason : successed!
     * result : {"data":{"pubdate":"2016-12-14","pubtime":"18:00:00","realtime":{"city_code":"101280601","city_name":"深圳","date":"2016-12-14","time":"19:00:00","week":3,"moon":"十一月十六","dataUptime":1481714250,"weather":{"temperature":"20","humidity":"60","info":"多云","img":"1"},"wind":{"direct":"北风","power":"2级","offset":null,"windspeed":null}},"life":{"date":"2016-12-14","info":{"chuanyi":["较舒适","建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"],"ganmao":["较易发","天凉，昼夜温差较大，较易发生感冒，请适当增减衣服，体质较弱的朋友请注意适当防护。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较适宜","天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意防风。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}},"weather":[{"date":"2016-12-14","info":{"day":["1","多云","22","东北风","3-4 级","06:55"],"night":["1","多云","14","东北风","3-4 级","17:41"]},"week":"三","nongli":"十一月十六"},{"date":"2016-12-15","info":{"dawn":["1","多云","14","东北风","3-4 级","17:41"],"day":["1","多云","19","东北风","3-4 级","06:55"],"night":["0","晴","11","东北风","3-4 级","17:41"]},"week":"四","nongli":"十一月十七"},{"date":"2016-12-16","info":{"dawn":["0","晴","11","东北风","3-4 级","17:41"],"day":["0","晴","17","东北风","3-4 级","06:56"],"night":["0","晴","12","","微风","17:42"]},"week":"五","nongli":"十一月十八"},{"date":"2016-12-17","info":{"dawn":["0","晴","12","无持续风向","微风","17:42"],"day":["0","晴","19","","微风","06:57"],"night":["0","晴","13","","微风","17:42"]},"week":"六","nongli":"十一月十九"},{"date":"2016-12-18","info":{"dawn":["0","晴","13","无持续风向","微风","17:42"],"day":["0","晴","21","","微风","06:57"],"night":["1","多云","14","","微风","17:43"]},"week":"日","nongli":"十一月二十"}],"f3h":{"temperature":[{"jg":"20161214170000","jb":"20"},{"jg":"20161214200000","jb":"19"},{"jg":"20161214230000","jb":"17"},{"jg":"20161215020000","jb":"15"},{"jg":"20161215050000","jb":"15"},{"jg":"20161215080000","jb":"14"},{"jg":"20161215110000","jb":"16"},{"jg":"20161215140000","jb":"18"},{"jg":"20161215170000","jb":"18"}],"precipitation":[{"jg":"20161214170000","jf":"0"},{"jg":"20161214200000","jf":"0"},{"jg":"20161214230000","jf":"0"},{"jg":"20161215020000","jf":"0"},{"jg":"20161215050000","jf":"0"},{"jg":"20161215080000","jf":"0"},{"jg":"20161215110000","jf":"0"},{"jg":"20161215140000","jf":"0"},{"jg":"20161215170000","jf":"0"}]},"pm25":{"key":"Shenzhen","show_desc":0,"pm25":{"curPm":"55","pm25":"35","pm10":"59","level":2,"quality":"良","des":"可以接受的，除极少数对某种污染物特别敏感的人以外，对公众健康没有危害。"},"dateTime":"2016年12月14日18时","cityName":"深圳"},"jingqu":"","jingqutq":"","date":"","isForeign":"0"}}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * data : {"pubdate":"2016-12-14","pubtime":"18:00:00","realtime":{"city_code":"101280601","city_name":"深圳","date":"2016-12-14","time":"19:00:00","week":3,"moon":"十一月十六","dataUptime":1481714250,"weather":{"temperature":"20","humidity":"60","info":"多云","img":"1"},"wind":{"direct":"北风","power":"2级","offset":null,"windspeed":null}},"life":{"date":"2016-12-14","info":{"chuanyi":["较舒适","建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"],"ganmao":["较易发","天凉，昼夜温差较大，较易发生感冒，请适当增减衣服，体质较弱的朋友请注意适当防护。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较适宜","天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意防风。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}},"weather":[{"date":"2016-12-14","info":{"day":["1","多云","22","东北风","3-4 级","06:55"],"night":["1","多云","14","东北风","3-4 级","17:41"]},"week":"三","nongli":"十一月十六"},{"date":"2016-12-15","info":{"dawn":["1","多云","14","东北风","3-4 级","17:41"],"day":["1","多云","19","东北风","3-4 级","06:55"],"night":["0","晴","11","东北风","3-4 级","17:41"]},"week":"四","nongli":"十一月十七"},{"date":"2016-12-16","info":{"dawn":["0","晴","11","东北风","3-4 级","17:41"],"day":["0","晴","17","东北风","3-4 级","06:56"],"night":["0","晴","12","","微风","17:42"]},"week":"五","nongli":"十一月十八"},{"date":"2016-12-17","info":{"dawn":["0","晴","12","无持续风向","微风","17:42"],"day":["0","晴","19","","微风","06:57"],"night":["0","晴","13","","微风","17:42"]},"week":"六","nongli":"十一月十九"},{"date":"2016-12-18","info":{"dawn":["0","晴","13","无持续风向","微风","17:42"],"day":["0","晴","21","","微风","06:57"],"night":["1","多云","14","","微风","17:43"]},"week":"日","nongli":"十一月二十"}],"f3h":{"temperature":[{"jg":"20161214170000","jb":"20"},{"jg":"20161214200000","jb":"19"},{"jg":"20161214230000","jb":"17"},{"jg":"20161215020000","jb":"15"},{"jg":"20161215050000","jb":"15"},{"jg":"20161215080000","jb":"14"},{"jg":"20161215110000","jb":"16"},{"jg":"20161215140000","jb":"18"},{"jg":"20161215170000","jb":"18"}],"precipitation":[{"jg":"20161214170000","jf":"0"},{"jg":"20161214200000","jf":"0"},{"jg":"20161214230000","jf":"0"},{"jg":"20161215020000","jf":"0"},{"jg":"20161215050000","jf":"0"},{"jg":"20161215080000","jf":"0"},{"jg":"20161215110000","jf":"0"},{"jg":"20161215140000","jf":"0"},{"jg":"20161215170000","jf":"0"}]},"pm25":{"key":"Shenzhen","show_desc":0,"pm25":{"curPm":"55","pm25":"35","pm10":"59","level":2,"quality":"良","des":"可以接受的，除极少数对某种污染物特别敏感的人以外，对公众健康没有危害。"},"dateTime":"2016年12月14日18时","cityName":"深圳"},"jingqu":"","jingqutq":"","date":"","isForeign":"0"}
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * pubdate : 2016-12-14
             * pubtime : 18:00:00
             * realtime : {"city_code":"101280601","city_name":"深圳","date":"2016-12-14","time":"19:00:00","week":3,"moon":"十一月十六","dataUptime":1481714250,"weather":{"temperature":"20","humidity":"60","info":"多云","img":"1"},"wind":{"direct":"北风","power":"2级","offset":null,"windspeed":null}}
             * life : {"date":"2016-12-14","info":{"chuanyi":["较舒适","建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"],"ganmao":["较易发","天凉，昼夜温差较大，较易发生感冒，请适当增减衣服，体质较弱的朋友请注意适当防护。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较适宜","天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意防风。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}}
             * weather : [{"date":"2016-12-14","info":{"day":["1","多云","22","东北风","3-4 级","06:55"],"night":["1","多云","14","东北风","3-4 级","17:41"]},"week":"三","nongli":"十一月十六"},{"date":"2016-12-15","info":{"dawn":["1","多云","14","东北风","3-4 级","17:41"],"day":["1","多云","19","东北风","3-4 级","06:55"],"night":["0","晴","11","东北风","3-4 级","17:41"]},"week":"四","nongli":"十一月十七"},{"date":"2016-12-16","info":{"dawn":["0","晴","11","东北风","3-4 级","17:41"],"day":["0","晴","17","东北风","3-4 级","06:56"],"night":["0","晴","12","","微风","17:42"]},"week":"五","nongli":"十一月十八"},{"date":"2016-12-17","info":{"dawn":["0","晴","12","无持续风向","微风","17:42"],"day":["0","晴","19","","微风","06:57"],"night":["0","晴","13","","微风","17:42"]},"week":"六","nongli":"十一月十九"},{"date":"2016-12-18","info":{"dawn":["0","晴","13","无持续风向","微风","17:42"],"day":["0","晴","21","","微风","06:57"],"night":["1","多云","14","","微风","17:43"]},"week":"日","nongli":"十一月二十"}]
             * f3h : {"temperature":[{"jg":"20161214170000","jb":"20"},{"jg":"20161214200000","jb":"19"},{"jg":"20161214230000","jb":"17"},{"jg":"20161215020000","jb":"15"},{"jg":"20161215050000","jb":"15"},{"jg":"20161215080000","jb":"14"},{"jg":"20161215110000","jb":"16"},{"jg":"20161215140000","jb":"18"},{"jg":"20161215170000","jb":"18"}],"precipitation":[{"jg":"20161214170000","jf":"0"},{"jg":"20161214200000","jf":"0"},{"jg":"20161214230000","jf":"0"},{"jg":"20161215020000","jf":"0"},{"jg":"20161215050000","jf":"0"},{"jg":"20161215080000","jf":"0"},{"jg":"20161215110000","jf":"0"},{"jg":"20161215140000","jf":"0"},{"jg":"20161215170000","jf":"0"}]}
             * pm25 : {"key":"Shenzhen","show_desc":0,"pm25":{"curPm":"55","pm25":"35","pm10":"59","level":2,"quality":"良","des":"可以接受的，除极少数对某种污染物特别敏感的人以外，对公众健康没有危害。"},"dateTime":"2016年12月14日18时","cityName":"深圳"}
             * jingqu :
             * jingqutq :
             * date :
             * isForeign : 0
             */

            private String pubdate;
            private String pubtime;
            private RealtimeBean realtime;
            private LifeBean life;
            private F3hBean f3h;
            private Pm25BeanX pm25;
            private String jingqu;
            private String jingqutq;
            private String date;
            private String isForeign;
            private List<WeatherBeanX> weather;

            public String getPubdate() {
                return pubdate;
            }

            public void setPubdate(String pubdate) {
                this.pubdate = pubdate;
            }

            public String getPubtime() {
                return pubtime;
            }

            public void setPubtime(String pubtime) {
                this.pubtime = pubtime;
            }

            public RealtimeBean getRealtime() {
                return realtime;
            }

            public void setRealtime(RealtimeBean realtime) {
                this.realtime = realtime;
            }

            public LifeBean getLife() {
                return life;
            }

            public void setLife(LifeBean life) {
                this.life = life;
            }

            public F3hBean getF3h() {
                return f3h;
            }

            public void setF3h(F3hBean f3h) {
                this.f3h = f3h;
            }

            public Pm25BeanX getPm25() {
                return pm25;
            }

            public void setPm25(Pm25BeanX pm25) {
                this.pm25 = pm25;
            }

            public String getJingqu() {
                return jingqu;
            }

            public void setJingqu(String jingqu) {
                this.jingqu = jingqu;
            }

            public String getJingqutq() {
                return jingqutq;
            }

            public void setJingqutq(String jingqutq) {
                this.jingqutq = jingqutq;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getIsForeign() {
                return isForeign;
            }

            public void setIsForeign(String isForeign) {
                this.isForeign = isForeign;
            }

            public List<WeatherBeanX> getWeather() {
                return weather;
            }

            public void setWeather(List<WeatherBeanX> weather) {
                this.weather = weather;
            }

            public static class RealtimeBean {
                /**
                 * city_code : 101280601
                 * city_name : 深圳
                 * date : 2016-12-14
                 * time : 19:00:00
                 * week : 3
                 * moon : 十一月十六
                 * dataUptime : 1481714250
                 * weather : {"temperature":"20","humidity":"60","info":"多云","img":"1"}
                 * wind : {"direct":"北风","power":"2级","offset":null,"windspeed":null}
                 */

                private String city_code;
                private String city_name;
                private String date;
                private String time;
                private int week;
                private String moon;
                private int dataUptime;
                private WeatherBean weather;
                private WindBean wind;

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public int getWeek() {
                    return week;
                }

                public void setWeek(int week) {
                    this.week = week;
                }

                public String getMoon() {
                    return moon;
                }

                public void setMoon(String moon) {
                    this.moon = moon;
                }

                public int getDataUptime() {
                    return dataUptime;
                }

                public void setDataUptime(int dataUptime) {
                    this.dataUptime = dataUptime;
                }

                public WeatherBean getWeather() {
                    return weather;
                }

                public void setWeather(WeatherBean weather) {
                    this.weather = weather;
                }

                public WindBean getWind() {
                    return wind;
                }

                public void setWind(WindBean wind) {
                    this.wind = wind;
                }

                public static class WeatherBean {
                    /**
                     * temperature : 20
                     * humidity : 60
                     * info : 多云
                     * img : 1
                     */

                    private String temperature;
                    private String humidity;
                    private String info;
                    private String img;

                    public String getTemperature() {
                        return temperature;
                    }

                    public void setTemperature(String temperature) {
                        this.temperature = temperature;
                    }

                    public String getHumidity() {
                        return humidity;
                    }

                    public void setHumidity(String humidity) {
                        this.humidity = humidity;
                    }

                    public String getInfo() {
                        return info;
                    }

                    public void setInfo(String info) {
                        this.info = info;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }
                }

                public static class WindBean {
                    /**
                     * direct : 北风
                     * power : 2级
                     * offset : null
                     * windspeed : null
                     */

                    private String direct;
                    private String power;
                    private Object offset;
                    private Object windspeed;

                    public String getDirect() {
                        return direct;
                    }

                    public void setDirect(String direct) {
                        this.direct = direct;
                    }

                    public String getPower() {
                        return power;
                    }

                    public void setPower(String power) {
                        this.power = power;
                    }

                    public Object getOffset() {
                        return offset;
                    }

                    public void setOffset(Object offset) {
                        this.offset = offset;
                    }

                    public Object getWindspeed() {
                        return windspeed;
                    }

                    public void setWindspeed(Object windspeed) {
                        this.windspeed = windspeed;
                    }
                }
            }

            public static class LifeBean {
                /**
                 * date : 2016-12-14
                 * info : {"chuanyi":["较舒适","建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"],"ganmao":["较易发","天凉，昼夜温差较大，较易发生感冒，请适当增减衣服，体质较弱的朋友请注意适当防护。"],"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较适宜","天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意防风。"],"ziwaixian":["弱","紫外线强度较弱，建议出门前涂擦SPF在12-15之间、PA+的防晒护肤品。"]}
                 */

                private String date;
                private InfoBean info;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBean getInfo() {
                    return info;
                }

                public void setInfo(InfoBean info) {
                    this.info = info;
                }

                public static class InfoBean {
                    private List<String> chuanyi;
                    private List<String> ganmao;
                    private List<String> kongtiao;
                    private List<String> xiche;
                    private List<String> yundong;
                    private List<String> ziwaixian;

                    public List<String> getChuanyi() {
                        return chuanyi;
                    }

                    public void setChuanyi(List<String> chuanyi) {
                        this.chuanyi = chuanyi;
                    }

                    public List<String> getGanmao() {
                        return ganmao;
                    }

                    public void setGanmao(List<String> ganmao) {
                        this.ganmao = ganmao;
                    }

                    public List<String> getKongtiao() {
                        return kongtiao;
                    }

                    public void setKongtiao(List<String> kongtiao) {
                        this.kongtiao = kongtiao;
                    }

                    public List<String> getXiche() {
                        return xiche;
                    }

                    public void setXiche(List<String> xiche) {
                        this.xiche = xiche;
                    }

                    public List<String> getYundong() {
                        return yundong;
                    }

                    public void setYundong(List<String> yundong) {
                        this.yundong = yundong;
                    }

                    public List<String> getZiwaixian() {
                        return ziwaixian;
                    }

                    public void setZiwaixian(List<String> ziwaixian) {
                        this.ziwaixian = ziwaixian;
                    }
                }
            }

            public static class F3hBean {
                private List<TemperatureBean> temperature;
                private List<PrecipitationBean> precipitation;

                public List<TemperatureBean> getTemperature() {
                    return temperature;
                }

                public void setTemperature(List<TemperatureBean> temperature) {
                    this.temperature = temperature;
                }

                public List<PrecipitationBean> getPrecipitation() {
                    return precipitation;
                }

                public void setPrecipitation(List<PrecipitationBean> precipitation) {
                    this.precipitation = precipitation;
                }

                public static class TemperatureBean {
                    /**
                     * jg : 20161214170000
                     * jb : 20
                     */

                    private String jg;
                    private String jb;

                    public String getJg() {
                        return jg;
                    }

                    public void setJg(String jg) {
                        this.jg = jg;
                    }

                    public String getJb() {
                        return jb;
                    }

                    public void setJb(String jb) {
                        this.jb = jb;
                    }
                }

                public static class PrecipitationBean {
                    /**
                     * jg : 20161214170000
                     * jf : 0
                     */

                    private String jg;
                    private String jf;

                    public String getJg() {
                        return jg;
                    }

                    public void setJg(String jg) {
                        this.jg = jg;
                    }

                    public String getJf() {
                        return jf;
                    }

                    public void setJf(String jf) {
                        this.jf = jf;
                    }
                }
            }

            public static class Pm25BeanX {
                /**
                 * key : Shenzhen
                 * show_desc : 0
                 * pm25 : {"curPm":"55","pm25":"35","pm10":"59","level":2,"quality":"良","des":"可以接受的，除极少数对某种污染物特别敏感的人以外，对公众健康没有危害。"}
                 * dateTime : 2016年12月14日18时
                 * cityName : 深圳
                 */

                private String key;
                private int show_desc;
                private Pm25Bean pm25;
                private String dateTime;
                private String cityName;

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public int getShow_desc() {
                    return show_desc;
                }

                public void setShow_desc(int show_desc) {
                    this.show_desc = show_desc;
                }

                public Pm25Bean getPm25() {
                    return pm25;
                }

                public void setPm25(Pm25Bean pm25) {
                    this.pm25 = pm25;
                }

                public String getDateTime() {
                    return dateTime;
                }

                public void setDateTime(String dateTime) {
                    this.dateTime = dateTime;
                }

                public String getCityName() {
                    return cityName;
                }

                public void setCityName(String cityName) {
                    this.cityName = cityName;
                }

                public static class Pm25Bean {
                    /**
                     * curPm : 55
                     * pm25 : 35
                     * pm10 : 59
                     * level : 2
                     * quality : 良
                     * des : 可以接受的，除极少数对某种污染物特别敏感的人以外，对公众健康没有危害。
                     */

                    private String curPm;
                    private String pm25;
                    private String pm10;
                    private int level;
                    private String quality;
                    private String des;

                    public String getCurPm() {
                        return curPm;
                    }

                    public void setCurPm(String curPm) {
                        this.curPm = curPm;
                    }

                    public String getPm25() {
                        return pm25;
                    }

                    public void setPm25(String pm25) {
                        this.pm25 = pm25;
                    }

                    public String getPm10() {
                        return pm10;
                    }

                    public void setPm10(String pm10) {
                        this.pm10 = pm10;
                    }

                    public int getLevel() {
                        return level;
                    }

                    public void setLevel(int level) {
                        this.level = level;
                    }

                    public String getQuality() {
                        return quality;
                    }

                    public void setQuality(String quality) {
                        this.quality = quality;
                    }

                    public String getDes() {
                        return des;
                    }

                    public void setDes(String des) {
                        this.des = des;
                    }
                }
            }

            public static class WeatherBeanX {
                /**
                 * date : 2016-12-14
                 * info : {"day":["1","多云","22","东北风","3-4 级","06:55"],"night":["1","多云","14","东北风","3-4 级","17:41"]}
                 * week : 三
                 * nongli : 十一月十六
                 */

                private String date;
                private InfoBeanX info;
                private String week;
                private String nongli;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBeanX getInfo() {
                    return info;
                }

                public void setInfo(InfoBeanX info) {
                    this.info = info;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getNongli() {
                    return nongli;
                }

                public void setNongli(String nongli) {
                    this.nongli = nongli;
                }

                public static class InfoBeanX {
                    private List<String> day;
                    private List<String> night;

                    public List<String> getDay() {
                        return day;
                    }

                    public void setDay(List<String> day) {
                        this.day = day;
                    }

                    public List<String> getNight() {
                        return night;
                    }

                    public void setNight(List<String> night) {
                        this.night = night;
                    }
                }
            }
        }
    }
}
