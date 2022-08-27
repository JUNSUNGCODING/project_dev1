package com.seb39.pre32.MyStackOverFlow.questions.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class QuestionsResposeDto {
    private long questionId;
    private long userId;
    private String questionTitle;
    private String questionContent;
    private long questionSelected;
    private long vote;
    private String questionCreateAt;
    private String questionModifiedAt;
    private boolean questionStatus;

}
