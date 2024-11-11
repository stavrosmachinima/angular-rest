package com.qualco.project.service;

import com.qualco.project.dto.Country_Stats_DTO;
import com.qualco.project.dto.Mixed_Data_DTO;
import com.qualco.project.repository.Country_Stats_Repository;
import com.qualco.project.repository.Mixed_Data_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Mixed_Data_Service_Impl implements Mixed_Data_Service {

    @Autowired
    private Mixed_Data_Repository mixed_data_repository;

    @Override
    public List<Mixed_Data_DTO> showMixedData() {
        return mixed_data_repository.showMixedData();
    }
}