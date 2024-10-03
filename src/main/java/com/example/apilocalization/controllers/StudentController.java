package com.example.apilocalization.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RestController
public class StudentController {

    private final MessageSource messageSource;

    @Autowired
    public StudentController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/student")
    public Map<String, Object> getStudentInfo(
            @RequestHeader(value = "Accept-Language", required = false, defaultValue = "en") Locale locale) {

        String studentName = "John Doe";
        int studentAge = 25;

        String nameKey = messageSource.getMessage("student.name", null, locale);
        String ageKey = messageSource.getMessage("student.age", null, locale);

        Map<String, Object> localizedStudentInfo = new HashMap<>();
        localizedStudentInfo.put(nameKey, studentName);
        localizedStudentInfo.put(ageKey, studentAge);

        return localizedStudentInfo;
    }
}