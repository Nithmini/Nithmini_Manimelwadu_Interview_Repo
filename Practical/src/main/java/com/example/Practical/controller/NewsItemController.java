package com.example.Practical.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Practical.entity.NewsItem;
import com.example.Practical.service.NewsItemService;

import java.util.List;
import java.util.Optional;

@RestController
public class NewsItemController {

    private final NewsItemService newsService;
    private final Categories categoryService;

    @Autowired
    public NewsItemController(NewsItemService newsService, Categories categoryService) {
        this.newsService = newsService;
        this.categoryService = categoryService;
    }

    // Get all categories
    @GetMapping("/categories")
    public ResponseEntity<List<Categories>> getAllCategories() {
        List<Categories> categories = categoryService.getAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    // Get all news headlines for a specific category
    @GetMapping("/categories/{id}/news")
    public ResponseEntity<List<NewsItem>> getNewsByCategory(@PathVariable Integer id) {
        try {
            List<com.example.Practical.repo.NewsItem> newsList = newsService.getNewsByCategory(id);
            return new ResponseEntity<>(newsList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Get full news item by news ID
    @GetMapping("/news/{id}")
    public ResponseEntity<NewsItem> getNewsById(@PathVariable Integer id) {
        try {
            Optional<News> news = newsService.getNewsById(id);
            return news.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Save a new news item (assuming only the news headline, content, and associated categories are passed)
    @PostMapping("/news")
    public ResponseEntity<NewsItem> saveNews(@RequestBody NewsItem news) {
        try {
            NewsItem savedNews = newsService.saveNews(news);
            return new ResponseEntity<>(savedNews, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
}

