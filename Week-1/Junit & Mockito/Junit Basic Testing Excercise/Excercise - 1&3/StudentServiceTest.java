package org.example;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    @Test

    public void getStudents() {
        StudentService studentservice = new StudentService();
        Student student = new Student(1,"Sonu");

        ArrayList<Student> listOfStudents = studentservice.getStudents();
        studentservice.addStudent(student);

        //assertTrue
        assertTrue(listOfStudents.size() > 0);

        // assertFalse
        assertFalse(listOfStudents.isEmpty());

        // assertEquals
        assertEquals(1, listOfStudents.size());

        // assertNotEquals
        assertNotEquals(0, listOfStudents.size());

        // assertNull
        Student s1 = null;
        assertNull(s1);

        // assertNotNull
        assertNotNull(student);

    }
}