package com.huanyu.http;
/* import com.alibaba.fastjson.JSON; */
import com.alibaba.fastjson.JSONObject;

import java.io.InputStream;
import java.net.InetAddress;
import java.util.Base64;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        HttpRequest h = new HttpRequest();
        String data = "username=用户名&password=密码&nasId=";
        String result = h.WutWifiConnect(data);
        System.out.println(result);
//        try {
//            HttpRequest h = new HttpRequest();
//            //向121.41.111.94/show发起POST请求，并传入name参数
//            Random r = new Random();
//            String data = "username=329379&password=z329379z&nasId="+52;
//            InputStream inputStream = h.sendPost("http://172.30.21.100/api/account/login", data);
////            byte[] data1 = h.uncompress(data);
//            String content = h.uncompressToString(inputStream);
//
////            String content = h.changeInputStream(inputStream,"UTF-8");
//            System.out.println(content);
//            JSONObject jsonObject = JSONObject.parseObject(content);
////        String jsonObject = JSON.toJSONString(content);
//            System.out.println(jsonObject);
//            System.out.println(jsonObject.getString("msg"));
//            if(jsonObject.getString("msg").indexOf("成功")>-1){
//
//            }else{
//                h.generateImage(content,"img");
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }
}
