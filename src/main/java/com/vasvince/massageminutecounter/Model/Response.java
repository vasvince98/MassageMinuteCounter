package com.vasvince.massageminutecounter.Model;

public class Response {
    private String username;
    private String email;
    private String passWord;

    public Response() {}

    public Response(String username, String email, String passWord) {
        this.username = "";
        this.email = "";
        this.passWord = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
