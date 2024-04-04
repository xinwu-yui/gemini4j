package com.yuixin.gemini4j.dto.inner;

import lombok.Data;
import java.util.List;

/**
 * @author: xinwu
 * @createTime: 2024/4/3
 * @mail: wuxinjy@foxmail.com
 * @description:
 */
@Data
public class PromptFeedback {
    /**
     * 安全评级
     */
    private List<SafetyRating> safetyRatings;

}
