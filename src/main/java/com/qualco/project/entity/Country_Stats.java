package com.qualco.project.entity;


import com.qualco.project.entity.key.Country_Stats_Id;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "country_stats")
@IdClass(Country_Stats_Id.class)
public class Country_Stats {

    @Id
    @Column(name = "country_id", nullable = false)
    private Integer country_id;

    @Id
    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "population")
    private Integer population;

    @Column(name = "gdp", precision = 15)
    private BigDecimal gdp;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false,insertable = false, updatable = false)
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    // Constructors
    public Country_Stats() {}

    // Getters and Setters
    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public BigDecimal getGdp() {
        return gdp;
    }

    public void setGdp(BigDecimal gdp) {
        this.gdp = gdp;
    }
}