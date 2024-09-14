package edu.icet.repository;

import edu.icet.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student,Integer> {

    Student findByFname(String name);
}
