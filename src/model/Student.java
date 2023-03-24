package model;

import gender.Gender;

public class Student {
    private String fullName;
    private  int age;
    private Gender gehder;

    public Student(String fullName, int age, Gender gehder) {
        this.fullName = fullName;
        this.age = age;
        this.gehder = gehder;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGehder() {
        return gehder;
    }

    public void setGehder(Gender gehder) {
        this.gehder = gehder;
    }

    @Override
    public String toString() {
        return "fullName='" + fullName +
                " age: " + age +
                " gehder: " + gehder;
    }
}
