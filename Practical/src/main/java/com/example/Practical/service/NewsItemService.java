package com.example.Practical.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Practical.repo.NewsItem;

@Service
public class NewsItemService {
	
	
	@Autowired
    private NewsItem newsItemRepository;

    public List<NewsItem> getNewsByCategory(Integer categoryId) {
        return newsItemRepository.findByCategoriesId(categoryId);
    }

    public Optional<NewsItem> getNewsById(Integer newsId) {
        return newsItemRepository.findById(newsId);
    }

	public com.example.Practical.entity.NewsItem saveNews(com.example.Practical.entity.NewsItem news) {
		// TODO Auto-generated method stub
		return null;
	}

}
