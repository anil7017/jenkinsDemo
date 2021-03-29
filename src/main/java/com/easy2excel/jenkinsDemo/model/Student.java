/*
package com.easy2excel.jenkinsDemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student")
@Setter
@Getter
public class Student {


    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @ManyToMany(fetch = FetchType.LAZY)
    Set<Course> courses = new HashSet<>();

}
*/
