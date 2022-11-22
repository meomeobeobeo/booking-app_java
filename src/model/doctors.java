package model;


import java.io.IOException;

import java.util.Scanner;

public class doctors {
    private String id;
    private  String name;
    private  int age;
    private  String level;
    private String work_place;
    private  String phone_number;
    private  String email;
    private String description;

    public doctors(String id, String name, int age, String level, String work_place, String phone_number, String email , String description) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.level = level;
        this.work_place = work_place;
        this.phone_number = phone_number;
        this.email = email;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLevel() {
        return level;
    }

    public String getWork_place() {
        return work_place;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setWork_place(String work_place) {
        this.work_place = work_place;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) throws IOException {





    }
}
