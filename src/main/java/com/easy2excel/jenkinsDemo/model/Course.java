/*
package com.easy2excel.jenkinsDemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "course")
@Setter
@Getter
public class Course {
    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "course_name")
    private String name;

    @Column(name = "price")
    private Integer price;

    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "courses")
    Set<Student> students = new HashSet<>();

}
*/
