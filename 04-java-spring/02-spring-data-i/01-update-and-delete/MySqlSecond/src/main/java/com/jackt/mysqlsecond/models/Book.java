package com.jackt.mysqlsecond.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 5, max = 200)
    private String title;
    @Size(min = 5, max = 200)
    private String description;
    @Size(min = 3, max = 40)
    private String language;
    @Min(100)
    private Integer numberOfPages;
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    public Book() {
    }
    public Book(String title, String desc, String lang, int pages) {
        this.title = title;
        this.description = desc;
        this.language = lang;
        this.numberOfPages = pages;
    }
    
    // other getters and setters removed for brevity
    public void setTitle (String title) {
    	this.title=title;
    }
    public String getTitle() {
    	return this.title;
    }
    public void setDescription (String description) {
    	this.description=description;
    }
    public String getLanguage() {
    	return this.language;
    }
    public void setLanguage(String language) {
    	this.language=language;
    }
    public void setId (Long id) {
    	this.id=id;
    }
    public Long getId() {
    	return this.id;
    }
    public void setNumberOfPages (Integer numberOfPages) {
    	this.numberOfPages=numberOfPages;
    }
    public Integer getNumberOfPages() {
    	return this.numberOfPages;
    }
    public Date getCreatedAt () {
    	return createdAt;
    }
    public Date getUpdatedAt () {
    	return this.updatedAt;
    }
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}