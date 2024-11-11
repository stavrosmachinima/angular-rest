package com.qualco.project.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "continents")
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "continent_id", nullable = false)
    private Integer continent_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToMany(mappedBy = "continent_id")
    private Set<Region> regions;

    public Set<Region> getRegions() {
        return regions;
    }

    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }

    public Continent(Integer continent_id, String name, Integer id) {
        this.continent_id = continent_id;
        this.name = name;
        this.id = id;
    }

    public Continent() {

    }

    public Integer getContinent_id() {
        return continent_id;
    }

    public void setContinent_id(Integer continent_id) {
        this.continent_id = continent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
