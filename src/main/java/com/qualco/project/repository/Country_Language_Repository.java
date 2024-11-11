package com.qualco.project.repository;

import com.qualco.project.entity.Country_Language;
import com.qualco.project.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Country_Language_Repository extends JpaRepository<Country_Language,Integer> {
    List<Country_Language> findByCountryId(Integer countryId);

}