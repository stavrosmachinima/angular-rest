package com.qualco.project.repository;

import com.qualco.project.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Country_Repository extends JpaRepository<Country,Integer> {

}
