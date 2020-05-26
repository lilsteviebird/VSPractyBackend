package com.in28minutes.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven;

public class Course {
    private long id;
    private String username;
    private String description;

    public Course(long id, String username, String description){
        this.id = id;
        this.username = username;
        this.description = description;
    }

    public Course(){

    }

    public long getId(){
        return this.id;
    }

    public String getUsername(){
        return this.username;
    }

    public String getDescription(){
        return this.Description;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setId(String description){
        this.description = description;
    }



}