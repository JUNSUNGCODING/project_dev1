package com.seb39.pre32.MyStackOverFlow.questions.repository;

import com.seb39.pre32.MyStackOverFlow.questions.entity.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionsRepository  extends JpaRepository<Questions, Long> {

    Optional<Questions>
}
