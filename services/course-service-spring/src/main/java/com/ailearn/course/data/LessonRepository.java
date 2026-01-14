package com.ailearn.course.data;

import com.ailearn.course.domain.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface LessonRepository extends JpaRepository<Lesson, UUID> {
    List<Lesson> findByCourseId(UUID courseId);
}
