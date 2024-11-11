package com.qualco.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id" ,nullable = false)
    private Integer languageId;

    @Column(name = "language", nullable = false, length = 50)
    private String language;

    // Constructors
    public Language() {}

    public Language(String language) {
        this.language = language;
    }

    // Getters and Setters
    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer language_id) {
        this.languageId = language_id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}