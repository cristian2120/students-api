package com.example.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class StudentServiceTest {

    @Test
    void testAddAndGetStudents() {
        StudentRepository repo = new StudentRepository();
        StudentService service = new StudentService();
        service.repository = repo;

        Student s = new Student(1L, "Juan", "Ingeniería", "A001");
        service.addStudent(s);

        List<Student> all = service.getAllStudents();
        assertEquals(1, all.size());
        assertEquals("Juan", all.get(0).getName());
    }
}