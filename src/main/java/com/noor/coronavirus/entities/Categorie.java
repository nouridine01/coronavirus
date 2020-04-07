package com.noor.coronavirus.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Categorie{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @JoinTable( name = "article_categorie",
            joinColumns = @JoinColumn( name = "idCategorie" ),
            inverseJoinColumns = @JoinColumn( name = "idArticle" ) )
    Collection<Article> articles = new ArrayList<>();

    //getters
    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    //setters

    public void setId(long id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

}