package com.qualco.project.repository;

import com.qualco.project.entity.Country;
import com.qualco.project.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Language_Repository extends JpaRepository<Language,Integer> {
}
