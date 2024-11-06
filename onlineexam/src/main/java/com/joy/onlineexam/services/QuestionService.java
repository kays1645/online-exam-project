package com.joy.onlineexam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joy.onlineexam.models.Question;
import com.joy.onlineexam.repositories.QuestionRepository;

@Service
public class QuestionService {
@Autowired
private QuestionRepository questionRepository;
public List<Question> getAllQuestions(){
	return questionRepository.findAll();
}
public Optional<Question> getQuestionById(Long id){
	return questionRepository.findById(id);
}
public Question addQuestion(Question question) {
    return questionRepository.save(question);
}
public Question updateQuestion(Long id, Question question) {
    if (questionRepository.existsById(id)) {
        question.setId(id); 
        return questionRepository.save(question);
    }
    return null;
}
public boolean deleteQuestion(Long id) {
    if (questionRepository.existsById(id)) {
        questionRepository.deleteById(id);
        return true;
    }
    return false;
}
}
