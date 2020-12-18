package com.free_open_university.backend.bean;

<<<<<<< HEAD
import javax.persistence.*;
import java.io.Serializable;
=======
import com.fasterxml.jackson.annotation.JsonIgnore;
>>>>>>> 941824806593315e59da0cb10183d60e41a6c9aa

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User implements Serializable {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "intro")
    private String intro;

    @OneToOne(mappedBy = "user")
    @JsonIgnore
    private UserHistory userHistory;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }


    public UserHistory getUserHistory() {
        return userHistory;
    }

    public void setUserHistory(UserHistory userHistory) {
        this.userHistory = userHistory;

    }
}
