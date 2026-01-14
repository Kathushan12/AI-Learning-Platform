package com.ailearn.course.domain;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class QuizQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private UUID lessonId;

    @Column(nullable = false, length = 2000)
    private String question;

    @Column(nullable = false)
    private String optionA;
    @Column(nullable = false)
    private String optionB;
    @Column(nullable = false)
    private String optionC;
    @Column(nullable = false)
    private String optionD;

    // "A"/"B"/"C"/"D"
    @Column(nullable = false)
    private String correctOption;

    public UUID getId() {
        return id;
    }

    public UUID getLessonId() {
        return lessonId;
    }

    public String getQuestion() {
        return question;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public void setLessonId(UUID lessonId) {
        this.lessonId = lessonId;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }
}
