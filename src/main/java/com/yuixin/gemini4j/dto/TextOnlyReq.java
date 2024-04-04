package com.yuixin.gemini4j.dto;

import com.yuixin.gemini4j.dto.inner.Content;
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
     * 内容
     */
    private List<Content> contents;

}
