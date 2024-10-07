package com.example.Practical.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String name;

	    @ManyToMany(mappedBy = "categories")
	    private Set<NewsItem> news;
	    
	    public Categories() {
	    	
	    }

		public Categories(int id, String name, Set<NewsItem> news) {
			super();
			this.id = id;
			this.name = name;
			this.news = news;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set<NewsItem> getNews() {
			return news;
		}

		public void setNews(Set<NewsItem> news) {
			this.news = news;
		}
	    
	    


}
