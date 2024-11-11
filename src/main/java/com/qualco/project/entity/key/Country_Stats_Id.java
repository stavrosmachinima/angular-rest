package com.qualco.project.entity.key;


import java.io.Serializable;
import java.util.Objects;

public class Country_Stats_Id implements Serializable {
    private Integer country_id;
    private Integer year;

    public Country_Stats_Id() {}

    public Country_Stats_Id(Integer country_id, Integer year) {
        this.country_id = country_id;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country_Stats_Id that = (Country_Stats_Id) o;
        return Objects.equals(country_id, that.country_id) &&
                Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country_id, year);
    }
}