package com.qualco.project.dto;

import java.math.BigDecimal;

public class Mixed_Data_DTO {
    private String continent_name;
    private String region_name;
    private String country_name;
    private Integer year;
    private Integer population;
    private BigDecimal gdp;

    public String getContinent_name() {
        return continent_name;
    }

    public void setContinent_name(String continent_name) {
        this.continent_name = continent_name;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
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

    public Mixed_Data_DTO(String continent_name, String region_name, String country_name, Integer year, Integer population, BigDecimal gdp) {
        this.continent_name = continent_name;
        this.region_name = region_name;
        this.country_name = country_name;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }
}
