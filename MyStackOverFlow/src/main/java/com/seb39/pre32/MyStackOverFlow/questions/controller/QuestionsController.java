package com.seb39.pre32.MyStackOverFlow.questions.controller;

import com.seb39.pre32.MyStackOverFlow.questions.service.QuestionsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/question")
public class QuestionsController {

    private final QuestionsService questionsService;

    public QuestionsController(){
        this.questionsService = new QuestionsService();
    }

    @PostMapping
    public ResponseEntity postQuestion(){

    }

    @PatchMapping
    public ResponseEntity patchQuestion(){

    }

    @GetMapping
    public ResponseEntity getQuestion(){

    }

    @GetMapping
    public ResponseEntity getQuestions(){

    }


    @DeleteMapping
    public ResponseEntity deleteQuestion(){

    }


}
