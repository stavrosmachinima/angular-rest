package com.qualco.project.entity;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "region_areas")  // You can adjust the table name as needed
public class Region_Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "region_name", length = 100,nullable = false)
    private String region_name;

    @Column(name = "region_area", precision = 15, scale = 2,nullable = false)
    private BigDecimal region_area;

    public Region_Area(Integer id, String region_name, BigDecimal region_area) {
        this.id = id;
        this.region_name = region_name;
        this.region_area = region_area;
    }


    public Region_Area() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String regionName) {
        this.region_name = regionName;
    }

    public BigDecimal getRegion_area() {
        return region_area;
    }

    public void setRegion_area(BigDecimal regionArea) {
        this.region_area = regionArea;
    }
}