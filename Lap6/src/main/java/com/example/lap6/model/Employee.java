package com.example.lap6.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    private String username;
    @Column(name = "emailid")
    private String emailId;
    @Column(name = "empid")
    private String empId;
    @Column(name = "bloodgp")
    private String bloodGp;
    private int age;
    @Column(name = "personalemail")
    private String personalEmail;
    @Column(name = "mobileno")
    private String mobileNo;
}
