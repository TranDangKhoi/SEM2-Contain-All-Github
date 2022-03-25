package com.selfpractice.authentication;

public class User { 
    private long id;
    private String username;
    private String email;
    private String password; 
    

    public User(long id , String username, String email, String password){
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getId(){return id;}
    public void setId(long id){this.id = id;}
    public void setUserName(String username){this.username = username;}
    public String getUsername(){return this.username;}
    public void setEmail(String email){this.email = email;}
    public String getEmail(){return email;}
    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}

    @Override
    public String toString(){
        return id + " - " + username + " - " + " - " + email + " - " + password;
    }
}
