package com.yuixin.gemini4j.dto;

import com.yuixin.gemini4j.dto.inner.Candidate;
import com.yuixin.gemini4j.dto.inner.PromptFeedback;
import lombok.Data;

import java.util.List;

/**
 * @author: xinwu
 * @createTime: 2024/4/3
 * @mail: wuxinjy@foxmail.com
 * @description:
 */

@Data
public class TextOnlyResp {

        private List<Candidate> candidates;
        private PromptFeedback promptFeedback;




}
