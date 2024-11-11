package com.qualco.project.entity;

import com.qualco.project.entity.key.Country_Languages_Id;

import javax.persistence.*;

@Entity
@Table(name = "country_languages")
@IdClass(Country_Languages_Id.class)  // Composite key class
public class Country_Language {
    @Id
    @Column(name = "country_id", nullable = false)
    private Integer countryId;

    @Id
    @Column(name = "language_id", nullable = false)
    private Integer language_id;

    @Column(name = "official", nullable = false)
    private Boolean official;

    // Default constructor
    public Country_Language() {
    }

    // Constructor with all fields
    public Country_Language(Integer countryId, Integer language_id, Boolean official) {
        this.countryId = countryId;
        this.language_id = language_id;
        this.official = official;
    }

    // Getters and Setters
    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer country_id) {
        this.countryId = country_id;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public Boolean getOfficial() {
        return official;
    }

    public void setOfficial(Boolean official) {
        this.official = official;
    }
}