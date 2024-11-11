package com.qualco.project.controller;

import com.qualco.project.dto.Country_Stats_DTO;
import com.qualco.project.dto.Mixed_Data_DTO;
import com.qualco.project.entity.Country;
import com.qualco.project.entity.Language;
import com.qualco.project.repository.Country_Repository;
import com.qualco.project.repository.Country_Language_Repository;
import com.qualco.project.repository.Language_Repository;
import com.qualco.project.service.Country_Stats_Service;
import com.qualco.project.service.Mixed_Data_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Controller {

    @Autowired
    private Country_Repository country_repository;

    @Autowired
    private Country_Language_Repository country_language_repository;

    @Autowired
    private Language_Repository language_repository;

    @Autowired
    private Country_Stats_Service country_stats_service;

    @Autowired
    private Mixed_Data_Service mixed_data_service;

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return country_repository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    @GetMapping("/countries/{countryId}/languages")
    public List<Language> getLanguagesByCountry(@PathVariable Integer countryId) {
        List<Integer> languageIds = country_language_repository.findByCountryId(countryId).stream().map(cl -> cl.getLanguage_id()).collect(Collectors.toList());
        return language_repository.findAllById(languageIds);
    }

    @GetMapping("/max-gdp-per-population")
    public List<Country_Stats_DTO> getMaxGdpPerPopulation() {
        return country_stats_service.findMaxGdpPerPopulation();
    }

    @GetMapping("/mixed-data")
    public List<Mixed_Data_DTO> showMixedData() {
        return mixed_data_service.showMixedData();
    }

}
