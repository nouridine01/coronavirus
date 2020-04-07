package com.noor.coronavirus.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Response{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String response;

    @ManyToOne(fetch = FetchType.EAGER)
    private Question question;
    
    //getters
    public long getId(){
        return this.id;
    }

    public String getResponse(){
        return this.response;
    }
    
    //setters

    public void setId(long id){
        this.id=id;
    }

    public void setResponse(String response){
        this.response=response;
    }

}