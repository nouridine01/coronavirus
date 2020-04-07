package com.noor.coronavirus.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
public class Article{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private String description;
    private Date date;
    private String country;
    private String language;
    private String image;

    @ManyToOne
    @JoinColumn(name="idUser", nullable=false)
    private User user;

    @ManyToMany(fetch= FetchType.EAGER)
    @JoinTable( name = "article_categorie",
            joinColumns = @JoinColumn( name = "idArticle" ),
            inverseJoinColumns = @JoinColumn( name = "idCategorie" ) )
    private Collection<Categorie> categories=new ArrayList<>();


       //getters
    public long getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getDescription(){
        return this.description;
    }

    public Date getDate(){
        return this.date;
    }
     public String getCountry(){
        return this.country;
    }

    public String getLanguage(){
        return this.language;
    }

    public String getImage(){
        return this.image;
    }

    //setters
    public void setId(long id){
       this.id=id;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setDate(Date date){
        this.date=date;
    }
     public void setCountry(String country){
        this.country=country;
    }

    public void setLanguage(String language){
        this.language=language;
    }

    public void setImage(String image){
        this.image=image;
    }

}