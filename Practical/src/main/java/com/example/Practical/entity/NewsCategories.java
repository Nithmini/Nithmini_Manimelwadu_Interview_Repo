package com.example.Practical.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "news_categories")
public class NewsCategories {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_categories_id")
	private Integer newsCategoriesId;
	
	@Column(name = "news_cat_name")
	private String newsCatName;

	public NewsCategories() {
		
	}
	
	public NewsCategories(Integer newsCategoriesId, String newsCatName) {
		super();
		this.newsCategoriesId = newsCategoriesId;
		this.newsCatName = newsCatName;
	}

	public Integer getNewsCategoriesId() {
		return newsCategoriesId;
	}

	public void setNewsCategoriesId(Integer newsCategoriesId) {
		this.newsCategoriesId = newsCategoriesId;
	}

	public String getNewsCatName() {
		return newsCatName;
	}

	public void setNewsCatName(String newsCatName) {
		this.newsCatName = newsCatName;
	}
	
	
}
