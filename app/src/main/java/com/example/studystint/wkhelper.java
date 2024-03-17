package com.example.studystint;

public class wkhelper {

    String name, age, contact, education;

    public wkhelper() {

    }

    public wkhelper(String name, String age, String contact, String education) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String contact) {
        this.education = education;
    }
}
