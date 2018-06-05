package org.ylu.diskmonitorwebapp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String snps_id;

    public User() {
    }

    public User(String firstName, String lastName, String email, String snps_id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.snps_id = snps_id;
    }
}
