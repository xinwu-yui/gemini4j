package com.yuixin.gemini4j.dto.inner;

import lombok.Data;

/**
 * @author: xinwu
 * @createTime: 2024/4/3
 * @mail: wuxinjy@foxmail.com
 * @description:
 */

@Data
public class SafetyRating {
    private String category;
    private String probability;

}