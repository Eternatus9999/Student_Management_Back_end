package edu.icet.dto;


import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {
    @Id
    private int id;
    private String fname;
    private String lname;
    private String age;
    private String gender;
    private String phone;
    private String address;
    private String grade;
    @Lob
    @Column(name = "image", columnDefinition = "LONGBLOB")
    private byte[] photo;
}
