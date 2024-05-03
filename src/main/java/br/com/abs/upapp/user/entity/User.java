package br.com.abs.upapp.user.entity;


import jakarta.persistence.*;


@Entity(name = "user-app")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable  = false)
    private String name;
    @Column(unique = true)
    private String email;
    @Column(length = 20)
    private String profile;
    @Column(length = 50)
    private String document;

    public User() {
    }

    public User(Long id, String name, String email, String profile, String document) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.profile = profile;
        this.document = document;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
