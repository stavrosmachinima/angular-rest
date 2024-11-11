package com.qualco.project.repository;

import com.qualco.project.dto.Country_Stats_DTO;
import com.qualco.project.entity.Country_Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Country_Stats_Repository extends JpaRepository<Country_Stats,Integer> {
    @Query("SELECT new com.qualco.project.dto.Country_Stats_DTO(c.name, c.country_code3, cs.year, cs.population, cs.gdp) " +
            "FROM Country c " +
            "JOIN Country_Stats cs ON c.country_id = cs.country_id " +
            "WHERE (cs.country_id, cs.gdp / cs.population) IN " +
            "    (SELECT cs2.country_id, MAX(cs2.gdp / cs2.population) " +
            "     FROM Country_Stats cs2" +
            "     GROUP BY cs2.country_id)")
    List<Country_Stats_DTO> findMaxGdpPerPopulation();
}
