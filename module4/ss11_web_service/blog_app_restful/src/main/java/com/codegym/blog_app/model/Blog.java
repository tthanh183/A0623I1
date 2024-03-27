package com.codegym.blog_app.model;

import jakarta.persistence.*;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String writer;
    private LocalDate publicDate;
    @Column(columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    private Category category;
    private String img;
    public Blog() {}
    public Blog(Long id, String title, String writer, LocalDate publicDate, String content, Category category, String img) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.publicDate = publicDate;
        this.content = content;
        this.category = category;
        this.img = img;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public LocalDate getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(LocalDate publicDate) {
        this.publicDate = publicDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


}
