package com.sherlock.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @Column(name="username")
    private String Username;

    @Column(name="full_name")
    private String Fullname;

    @Column(name="user_password")
    private String Password;

    @Column(name="dob")
    private String DateOfBirth;

    public  Users(){

    }

    public Users(String username, String fullname, String password, String dateOfBirth) {
        Username = username;
        Fullname = fullname;
        Password = password;
        DateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return Username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        Username = username;
    }

    public String getFullname() {
        return Fullname;
    }

    @JsonProperty("fullname")
    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getPassword() {
        return Password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        Password = password;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

}
