package com.example.Practical.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsItem extends JpaRepository<NewsItem, Integer> {
    List<NewsItem> findByCategoriesId(Integer categoryId);

	
}

