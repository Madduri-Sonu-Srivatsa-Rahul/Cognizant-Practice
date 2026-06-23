package org.example;

public class Student {
    public int id;
    public String name;

    Student(int id,String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
