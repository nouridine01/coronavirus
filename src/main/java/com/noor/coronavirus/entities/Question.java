package com.noor.coronavirus.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Question{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String question;

    @OneToMany( targetEntity=Response.class,mappedBy = "question")
    Collection<Response> responses= new ArrayList<>();


    //getters
    public long getId(){
        return this.id;
    }

    public String getQuestion(){
        return this.question;
    }
    
    //setters

    public void setId(long id){
        this.id=id;
    }

    public void setQuestion(String question){
        this.question=question;
    }

}