package com.example.student;

public class Student {
    private Long id;
    private String name;
    private String career;
    private String registration;

    public Student() {}

    public Student(Long id, String name, String career, String registration) {
        this.id = id;
        this.name = name;
        this.career = career;
        this.registration = registration;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCareer() { return career; }
    public void setCareer(String career) { this.career = career; }
    public String getRegistration() { return registration; }
    public void setRegistration(String registration) { this.registration = registration; }
}