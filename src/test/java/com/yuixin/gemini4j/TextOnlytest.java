package com.yuixin.gemini4j;

import com.yuixin.gemini4j.dto.TextOnlyReq;
import com.yuixin.gemini4j.dto.TextOnlyResp;
import com.yuixin.gemini4j.service.GeminiTextOnlyService;

/**
 * @author: xinwu
 * @createTime: 2024/4/3
 * @mail: wuxinjy@foxmail.com
 * @description:
 */
public class TextOnlytest {
    public static void main(String[] args) {
        TextOnlyResp generate = new GeminiTextOnlyService().generate("http://baidu.com", "111");
        System.out.println(generate);
    }
}
