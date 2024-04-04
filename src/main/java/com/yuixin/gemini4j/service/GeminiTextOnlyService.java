package com.yuixin.gemini4j.service;

import com.google.common.collect.Lists;
import com.yuixin.gemini4j.dto.TextOnlyReq;
import com.yuixin.gemini4j.dto.TextOnlyResp;
import com.yuixin.gemini4j.dto.inner.Content;
import com.yuixin.gemini4j.dto.inner.Part;
import com.yuixin.gemini4j.util.GsonUtil;
import com.yuixin.gemini4j.util.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author: xinwu
 * @createTime: 2024/4/3
 * @mail: wuxinjy@foxmail.com
 * @description:
 */

@Slf4j
public class GeminiTextOnlyService {

    /**
     * 纯文本生成
     * @param text
     * @return
     */
    public TextOnlyResp generate(String url, String text) {
        if (StringUtils.isBlank(text)) {
            return null;
        }
        Part part = new Part(text);
        List<Part> parts = Lists.newArrayListWithCapacity(1);
        parts.add(part);
        Content content = new Content(parts, null);
        List<Content> contents = Lists.newArrayListWithCapacity(1);
        contents.add(content);
        TextOnlyReq req = new TextOnlyReq();
        req.setContents(contents);
        String responseJsonString = HttpUtil.postJsonString(url, GsonUtil.toJsonString(req));
        if (StringUtils.isBlank(responseJsonString)) {
            return null;
        }
        return GsonUtil.fromJson(responseJsonString, TextOnlyResp.class);
    }
}
