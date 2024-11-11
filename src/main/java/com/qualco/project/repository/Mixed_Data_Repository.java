package com.qualco.project.repository;

import com.qualco.project.dto.Country_Stats_DTO;
import com.qualco.project.dto.Mixed_Data_DTO;
import com.qualco.project.entity.Country_Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Mixed_Data_Repository extends JpaRepository<Country_Stats,Integer> {
    @Query("SELECT new com.qualco.project.dto.Mixed_Data_DTO(con.name, reg.name, cou.name, cs.year, cs.population,cs.gdp) " +
            "FROM Continent con " +
            "JOIN con.regions reg " +
            "JOIN reg.countries cou " +
            "JOIN cou.countryStats cs")
    List<Mixed_Data_DTO> showMixedData();
}
