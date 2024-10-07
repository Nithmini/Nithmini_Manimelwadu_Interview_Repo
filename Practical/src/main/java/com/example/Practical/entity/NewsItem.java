package com.example.Practical.entity;

import java.util.Set;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "news_item")
public class NewsItem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "news_item_id")
	private Integer newsItemId;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "news_categories",
        joinColumns = @JoinColumn(name = "news_item_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Categories> categories;
	 
	
	
	@Column(name = "headline")
	private String headline;

	@Column(name = "content")
    private String content;
	
	@Column(name = "date")
    private String date;
	
	public NewsItem() {

    }

	public NewsItem(Integer newsItemId, Set<Categories> categories, String headline, String content, String date) {
		super();
		this.newsItemId = newsItemId;
		this.categories = categories;
		this.headline = headline;
		this.content = content;
		this.date = date;
	}

	public Integer getNewsItemId() {
		return newsItemId;
	}

	public void setNewsItemId(Integer newsItemId) {
		this.newsItemId = newsItemId;
	}

	public Set<Categories> getCategories() {
		return categories;
	}

	public void setCategories(Set<Categories> categories) {
		this.categories = categories;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
    

	
}
