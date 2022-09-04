package com.vasvince.massageminutecounter.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private int id;
    private String vezetekNev;
    private String keresztNev;
    private String email;

    public User() {}

    public User(String vezetekNev, String keresztNev, String email) {
        this.vezetekNev = vezetekNev;
        this.keresztNev = keresztNev;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVezetekNev() {
        return vezetekNev;
    }

    public void setVezetekNev(String vezetekNev) {
        this.vezetekNev = vezetekNev;
    }

    public String getKeresztNev() {
        return keresztNev;
    }

    public void setKeresztNev(String keresztNev) {
        this.keresztNev = keresztNev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "vezetekNev='" + vezetekNev + '\'' +
                ", keresztNev='" + keresztNev + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
