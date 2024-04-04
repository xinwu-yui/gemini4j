package com.yuixin.gemini4j.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author: xinwu
 * @createTime: 2024/4/3
 * @mail: wuxinjy@foxmail.com
 * @description:
 */
public class GsonUtil {
    private static Gson gson;

    private GsonUtil(){}

    static {
        gson = new GsonBuilder().create();
    }

    public static String toJsonString(Object obj) {
        return gson.toJson(obj);
    }

    public static <T> T fromJson(String jsonStr, Class<T> clazz) {
        return gson.fromJson(jsonStr, clazz);
    }
}
