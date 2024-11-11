package com.qualco.project.service;

import com.qualco.project.dto.Country_Stats_DTO;

import java.util.List;

public interface Country_Stats_Service {
    public List<Country_Stats_DTO> findMaxGdpPerPopulation();

}
