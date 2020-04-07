package com.noor.coronavirus.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String login;
    @NotEmpty
    @Size(min = 8)
    private String password;

    @OneToMany( targetEntity=Article.class, mappedBy="user" )
    Collection<Article> articles = new ArrayList<>();

    @OneToMany( targetEntity=Questionnaire.class, mappedBy="user" )
    Collection<Questionnaire> questionnaires = new ArrayList<>();


    @ManyToMany(fetch= FetchType.EAGER)
    private Collection<Role> roles=new ArrayList<>();

    private String lastName;
    private String firstName;
    private Boolean active;


    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }


    //getters
    public long getId(){
        return this.id;
    }

    public String getPassword(){
        return this.password;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public Boolean getActive(){
        return this.active;
    }

    //setters
    public void setId(long id){
        this.id=id;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setActive(Boolean active){
        this.active=active;
    }

}
