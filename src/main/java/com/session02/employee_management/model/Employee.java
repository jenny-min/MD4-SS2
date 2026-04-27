package com.session02.employee_management.model;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String departement;

    public Employee() {
    }

    public Employee(long id, String fullName, String email, String departement) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.departement = departement;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
}
