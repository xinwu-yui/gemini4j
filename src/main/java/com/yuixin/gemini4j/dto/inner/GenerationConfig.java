package com.yuixin.gemini4j.dto.inner;

import lombok.Data;

import java.util.List;

/**
 * @author: xinwu
 * @createTime: 2024/4/4
 * @mail: wuxinjy@foxmail.com
 * @description:
 */

@Data
public class GenerationConfig {
    private List<String> stopSequences;
    private String temperature;
    private String maxOutputTokens;
    private String topP;
    private String topK;
}
