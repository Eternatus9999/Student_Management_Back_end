package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface StudentService {
    Student getByName(String name);
    List<Student> getAll();
    void addStudent(Student student);

    void updateStudent(Student student);

    void deletStudent(Integer id);

    void deleteAll();
}
