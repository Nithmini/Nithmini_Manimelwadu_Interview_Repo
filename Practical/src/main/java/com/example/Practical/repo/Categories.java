package com.example.Practical.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Categories extends JpaRepository<Categories, Integer>{

}


