package com.seb39.pre32.MyStackOverFlow.questions.service;

import com.seb39.pre32.MyStackOverFlow.questions.entity.Questions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {

    public Questions createQuestion(Questions questions){

        Questions createQuestion = questions;

        return questions;
    }

    public Questions updateQuestion(Questions questions){


        Questions updateQuestion = questions;
        return questions;
    }

    public Questions findQuestion(long questionId){


        return null;
    }

    public List<Questions> findQuesions(){

        return null;
    }

    public void deleteQuestion(long questionId){


    }

}
