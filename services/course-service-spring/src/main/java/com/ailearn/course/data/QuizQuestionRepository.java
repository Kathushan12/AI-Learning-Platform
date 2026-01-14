package com.ailearn.course.data;

import com.ailearn.course.domain.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, UUID> {
    List<QuizQuestion> findByLessonId(UUID lessonId);
}
