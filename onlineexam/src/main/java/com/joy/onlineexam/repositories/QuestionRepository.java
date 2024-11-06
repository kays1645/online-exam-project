package com.joy.onlineexam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joy.onlineexam.models.Question;

public interface QuestionRepository extends JpaRepository<Question,Long> {

}
