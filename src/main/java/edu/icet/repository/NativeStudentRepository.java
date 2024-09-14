package edu.icet.repository;

import edu.icet.dto.Student;

public interface NativeStudentRepository {
    public Student findByFname(String name);
}
