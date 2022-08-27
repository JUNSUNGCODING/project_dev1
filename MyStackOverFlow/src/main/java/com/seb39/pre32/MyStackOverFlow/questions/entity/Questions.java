package com.seb39.pre32.MyStackOverFlow.questions.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "QUESTIONS")
public class Questions {

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
