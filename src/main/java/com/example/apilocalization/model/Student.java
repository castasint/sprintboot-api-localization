package com.example.apilocalization.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String nameLabel;
    private String name;
    private String ageLabel;
    private int age;
}