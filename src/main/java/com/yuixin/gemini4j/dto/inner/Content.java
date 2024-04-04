package com.yuixin.gemini4j.dto.inner;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: xinwu
 * @createTime: 2024/4/3
 * @mail: wuxinjy@foxmail.com
 * @description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Content {
    /**
     * parts
     */
    private List<Part> parts;

    private String role;
}
