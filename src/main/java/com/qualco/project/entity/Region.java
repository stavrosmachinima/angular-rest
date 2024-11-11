package com.qualco.project.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "regions")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id",nullable = false)
    private Integer region_id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "continent_id", insertable = false, updatable = false, nullable = false)
    private Continent continent_id;

    @OneToMany(mappedBy = "region_id")
    private Set<Country> countries;

    public Set<Country> getCountries() {
        return countries;
    }

    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }

    public Region(Integer region_id, String name, Continent continent_id) {
        this.region_id = region_id;
        this.name = name;
        this.continent_id = continent_id;
    }


    public Region() {

    }

    public Integer getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent_id() {
        return continent_id;
    }

    public void setContinent_id(Continent continent_id) {
        this.continent_id = continent_id;
    }
}
