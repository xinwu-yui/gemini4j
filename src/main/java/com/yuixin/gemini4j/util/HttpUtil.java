package com.yuixin.gemini4j.util;

import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import java.io.IOException;

/**
 * @author: xinwu
 * @createTime: 2024/4/3
 * @mail: wuxinjy@foxmail.com
 * @description:
 */

@Slf4j
public class HttpUtil {
    /**
     * okhttpclient客户端
     */
    private static OkHttpClient httpClient;

    private static final MediaType MEDIA_JSON = MediaType.get("application/json");

    private HttpUtil(){
    }

    static {
        httpClient = new OkHttpClient();
    }
    public static String postJsonString(String url, String jsonStr) {
        RequestBody requestBody = RequestBody.create(jsonStr, MEDIA_JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        try(Response response = httpClient.newCall(request).execute()) {
            return response.body().string();
        }catch (IOException e) {
            log.error("{}", e);
        }
        return null;
    }
}
