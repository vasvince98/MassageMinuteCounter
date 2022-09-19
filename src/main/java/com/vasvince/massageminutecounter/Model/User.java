package com.vasvince.massageminutecounter.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private int id;
    private String username;
    private String vezetekNev;
    private String keresztNev;
    private String email;
    private boolean isAuthorized;

    public User() {}

    public User(String username, String vezetekNev, String keresztNev, String email) {
        this.username = username;
        this.vezetekNev = vezetekNev;
        this.keresztNev = keresztNev;
        this.email = email;
        this.isAuthorized = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", vezetekNev='" + vezetekNev + '\'' +
                ", keresztNev='" + keresztNev + '\'' +
                ", email='" + email + '\'' +
                ", isAuthorized=" + isAuthorized +
                '}';
    }
}
