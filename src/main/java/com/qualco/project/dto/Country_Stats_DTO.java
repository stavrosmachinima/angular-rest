package com.qualco.project.dto;

import java.math.BigDecimal;

public class Country_Stats_DTO {
    private String name;
    private String country_code3;
    private Integer year;
    private Integer population;
    private BigDecimal gdp;


    public Country_Stats_DTO(String name, String country_code3, Integer year, Integer population, BigDecimal gdp) {
        this.name = name;
        this.country_code3 = country_code3;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry_code3() {
        return country_code3;
    }

    public void setCountry_code3(String country_code3) {
        this.country_code3 = country_code3;
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
