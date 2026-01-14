package com.ailearn.course.domain;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private UUID courseId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, length = 10000)
    private String contentMarkdown;

    public UUID getId() {
        return id;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public String getContentMarkdown() {
        return contentMarkdown;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContentMarkdown(String contentMarkdown) {
        this.contentMarkdown = contentMarkdown;
    }
}
