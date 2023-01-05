package com.example.project.project.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "catalog")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "author")
    private String author;
    @Column(name = "title")
    private String title;
    @Column(name = "genre")
    private String genre;
    @Column(name = "price")
    private String price;
    @Column(name = "publishDate")
    private Date publishDate;
    @Column(name = "description")
    private String description;

    public BookEntity(long id, String author, String title, String genre, String price, Date publishDate, String description){
        this.id = id;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.publishDate = publishDate;
        this.title = title;
        this.description = description;
    }

    public BookEntity(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
