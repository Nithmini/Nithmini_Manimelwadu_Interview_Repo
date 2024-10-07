package com.example.Practical.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Practical.entity.NewsItem;
import com.example.Practical.service.NewsItemService;

import ch.qos.logback.core.model.Model;

@RestController
public class Categories {
	
	@Autowired
    private Categories categoryService;

    @Autowired
    private NewsItemService newsService;

    @GetMapping("/categories")
    public String listCategories(Model model) {
        List<Categories> categories = categoryService.getAllCategories();
        ((Object) model).addAttribute("categories", categories);
        return "categories";
    }

    List<Categories> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/categories/{id}/news")
    public String listNewsByCategory(@PathVariable Integer id, Model model) {
        List<com.example.Practical.repo.NewsItem> newsList = newsService.getNewsByCategory(id);
        ((Object) model).addAttribute("newsList", newsList);
        return "news_headlines";
    }

    @GetMapping("/news/{id}")
    public String getNewsDetails(@PathVariable Integer id, Model model) {
        Optional<com.example.Practical.repo.NewsItem> news = newsService.getNewsById(id);
        news.ifPresent(value -> model.addAttribute("news", value));
        return "news_details";
    }

}
