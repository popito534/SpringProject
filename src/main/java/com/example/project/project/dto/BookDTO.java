package com.example.project.project.dto;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement
public class BookDTO {
    public Long id;
    public String author;
    public String title;
    public String genre;
    public String price;
    public Date publishDate;
    public String description;

}
