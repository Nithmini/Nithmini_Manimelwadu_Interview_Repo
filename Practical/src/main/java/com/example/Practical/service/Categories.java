package com.example.Practical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.example.Practical.repo.Categories;

@Service
public class Categories {
	
	@Autowired
    private Categories categoriesRepository;

    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }

	private List<Categories> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
