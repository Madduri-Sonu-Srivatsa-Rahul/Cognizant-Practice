package org.example;

import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> listOfStudents = new ArrayList<>();

    public ArrayList<Student> getStudents(){
        return this.listOfStudents;
    }

    public void addStudent(Student stud){
        listOfStudents.add(stud);
    }
}
