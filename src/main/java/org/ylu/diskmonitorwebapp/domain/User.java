package org.ylu.diskmonitorwebapp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class User {

    @Id
    @Column(name = "ID",unique=true, nullable = false, columnDefinition="VARCHAR(32)")
    private String id;

    private String firstName;
    private String lastName;
    private String email;


    public User() {
    }

    public User(String firstName, String lastName, String email, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
    }
}
