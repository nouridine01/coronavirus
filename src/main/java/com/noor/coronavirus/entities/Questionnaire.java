package com.noor.coronavirus.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
public class Questionnaire{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private String result;
    private String state;


    @ManyToOne
    @JoinColumn(name="idUser", nullable=false)
    private User user;

    @OneToMany( targetEntity=Response.class)
    Collection<Response> responses= new ArrayList<>();



    //getters

    //setters

    public void setId(long id){
        this.id=id;
    }

    public void setDate(Date date){
        this.date=date;
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getResult() {
        return result;
    }

    public String getState() {
        return state;
    }

    public void setResult(String result){
        this.result=result;
    }

    public void setState(String state){
        this.state=state;
    }
}