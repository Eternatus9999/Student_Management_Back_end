package edu.icet.repository.imp;

import edu.icet.dto.Student;
import edu.icet.repository.NativeStudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class NativeStudentRepositoryImp implements NativeStudentRepository {
    final NamedParameterJdbcTemplate namedJdbcTemplate;
    final JdbcTemplate jdbcTemplate;

    public Student findByFname(String name){
        return jdbcTemplate.queryForObject(
                "SELECT * FROM student WHERE fname = :name",Student.class
        );
    }
}
