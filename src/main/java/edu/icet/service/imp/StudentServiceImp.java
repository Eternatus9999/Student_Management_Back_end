package edu.icet.service.imp;

import edu.icet.dto.Student;
import edu.icet.repository.NativeStudentRepository;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService {

    final NativeStudentRepository nativerepository;
    final StudentRepository repository;

    @Override
    public Student getByName(String name) {
        return repository.findByFname(name);
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        repository.save(student);
    }

    @Override
    public void deletStudent(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
