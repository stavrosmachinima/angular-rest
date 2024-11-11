package com.qualco.project.entity.key;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Country_Languages_Id implements Serializable {
    private Integer countryId;
    private Integer language_id;

    public Country_Languages_Id() {
    }

    public Country_Languages_Id(Integer countryId, Integer language_id) {
        this.countryId = countryId;
        this.language_id = language_id;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country_Languages_Id that = (Country_Languages_Id) o;
        return Objects.equals(countryId, that.countryId) &&
                Objects.equals(language_id, that.language_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, language_id);
    }
}