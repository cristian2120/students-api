package com.example.student;

import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    private Map<Long, Student> students = new HashMap<>();

    public Student save(Student student) {
        students.put(student.getId(), student);
        return student;
    }

    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }

    public void deleteById(Long id) {
        students.remove(id);
    }
}