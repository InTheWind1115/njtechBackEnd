package com.njtechstation.domain;

public class User {
    private int id;
    private String username;
    private String userpwd;
    private String phone;
    private String identity;
    private String email;

    public User() {
    }

    public User(int id, String username, String userpwd, String phone, String identity, String email) {
        this.id = id;
        this.username = username;
        this.userpwd = userpwd;
        this.phone = phone;
        this.identity = identity;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
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
                "id=" + id +
                ", username='" + username + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", phone='" + phone + '\'' +
                ", identity='" + identity + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
