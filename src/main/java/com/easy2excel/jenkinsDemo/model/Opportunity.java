package com.easy2excel.jenkinsDemo.model;

import lombok.Getter;
import lombok.Setter;

//@Entity
@Setter
@Getter
//@Table(name = "opportunity")
public class Opportunity {
    private Long id;
    private String name;
    private String currency;
    private float amount;
}
