package com.noor.coronavirus.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String role;

    
    //getters
    public long getId(){
        return this.id;
    }

    public String getRole(){
        return this.role;
    }
    
    //setters

    public void setId(long id){
        this.id=id;
    }

    public void setRole(String role){
        this.role=role;
    }

}