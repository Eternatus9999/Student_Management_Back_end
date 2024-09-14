package edu.icet.controller;


import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class StudentController {
    final StudentService service;
    @GetMapping
    private List<Student> getAll(){
        return service.getAll();
    }
    @GetMapping("/{name}")
    private Student getById(@PathVariable String name){
        return service.getByName(name);
    }
    @PostMapping
    private void addStudent(@RequestPart("image") MultipartFile file,@RequestPart("student") Student student) throws IOException {
        student.setPhoto(file.getBytes());
        service.addStudent(student);
    }
    @PutMapping()
    private void updateStudent(@RequestBody Student student){
        student.setPhoto(service.getByName(student.getFname()).getPhoto());
        service.updateStudent(student);
    }
    @PutMapping("/photo")
    private void updateStudent(@RequestPart("image") MultipartFile file,@RequestPart("student") Student student) throws IOException {
        student.setPhoto(file.getBytes());
        service.updateStudent(student);
    }
    @DeleteMapping("/{id}")
    private void deleteStudent(@PathVariable Integer id){
        service.deletStudent(id);
    }
    @DeleteMapping()
    private void deleteStudent(){
        service.deleteAll();
    }
}
