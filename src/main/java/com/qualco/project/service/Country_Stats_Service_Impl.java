package com.qualco.project.service;

import com.qualco.project.dto.Country_Stats_DTO;
import com.qualco.project.repository.Country_Stats_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Country_Stats_Service_Impl implements Country_Stats_Service {

    @Autowired
    private Country_Stats_Repository country_stats_repository;

    @Override
    public List<Country_Stats_DTO> findMaxGdpPerPopulation() {
        return country_stats_repository.findMaxGdpPerPopulation();
    }
}
