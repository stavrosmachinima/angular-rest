package com.qualco.project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", nullable = false)
    private Integer country_id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "area", nullable = false, precision = 10, scale = 2)
    private BigDecimal area;

    @Column(name = "national_day")
    private LocalDate national_day;

    @Column(name = "country_code2", nullable = false, length = 2, unique = true)
    private String country_code2;

    @Column(name = "country_code3", nullable = false, length = 3, unique = true)
    private String country_code3;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "region_id", insertable = false, updatable = false, nullable = false)
    private Region region_id;

    @OneToMany(mappedBy = "country_id")
    @JsonIgnore
    private Set<Country_Stats> countryStats;

    public Set<Country_Stats> getCountryStats() {
        return countryStats;
    }

    public void setCountryStats(Set<Country_Stats> countryStats) {
        this.countryStats = countryStats;
    }

    // Default constructor
    public Country() {
    }

    // Constructor with all fields
    public Country(Integer country_id, String name, BigDecimal area,
                   LocalDate national_day, String country_code2,
                   String country_code3, Region region_id) {
        this.country_id = country_id;
        this.name = name;
        this.area = area;
        this.national_day = national_day;
        this.country_code2 = country_code2;
        this.country_code3 = country_code3;
        this.region_id = region_id;
    }

    // Getters and Setters
    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public LocalDate getNational_day() {
        return national_day;
    }

    public void setNational_day(LocalDate nationalDay) {
        this.national_day = nationalDay;
    }

    public String getCountry_code2() {
        return country_code2;
    }

    public void setCountry_code2(String countryCode2) {
        this.country_code2 = countryCode2;
    }

    public String getCountry_code3() {
        return country_code3;
    }

    public void setCountry_code3(String countryCode3) {
        this.country_code3 = countryCode3;
    }

    public Region getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Region regionId) {
        this.region_id = regionId;
    }
}