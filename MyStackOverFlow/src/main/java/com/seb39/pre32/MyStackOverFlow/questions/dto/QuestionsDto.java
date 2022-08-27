package com.seb39.pre32.MyStackOverFlow.questions.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class QuestionsDto {

    @Getter
    @AllArgsConstructor
    public static class Post{
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

    @Getter
    @AllArgsConstructor
    public static class Patch{
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

    @Getter
    @AllArgsConstructor
    public static class Response{
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


}
