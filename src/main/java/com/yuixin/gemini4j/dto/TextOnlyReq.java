package com.yuixin.gemini4j.dto;

import com.yuixin.gemini4j.dto.inner.Content;
import com.yuixin.gemini4j.dto.inner.GenerationConfig;
import lombok.Data;
import java.util.List;

/**
 * @author: xinwu
 * @createTime: 2024/4/3
 * @mail: wuxinjy@foxmail.com
 * @description:
 */

@Data
public class TextOnlyReq {

    /**
     * content list
     */
    private List<Content> contents;

    /**
     * config
     */
    private GenerationConfig generationConfig;
}
