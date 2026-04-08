package com.portfolio.studentapi.services;

import com.portfolio.studentapi.models.entities.Student;
import com.portfolio.studentapi.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Student createStudent(Student student) {
        if (repository.existsByEmail(student.getEmail())) {
            throw new RuntimeException("Email already exists");
        }
        return repository.save(student);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = getStudentById(id);
        student.setName(studentDetails.getName());
        student.setPhone(studentDetails.getPhone());
        student.setAddress(studentDetails.getAddress());
        student.setMajor(studentDetails.getMajor());
        if (!student.getEmail().equals(studentDetails.getEmail()) && repository.existsByEmail(studentDetails.getEmail())) {
            throw new RuntimeException("Email already exists");
        }
        student.setEmail(studentDetails.getEmail());
        return repository.save(student);
    }

    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        repository.delete(student);
    }
}
