package com.app.Cria.domain;

import com.app.Cria.domain.enums.RoleSchool;

import java.time.LocalDate;

public class Employee {
    private Long id;
    private String CPF;
    private String firstName;
    private String lastName;
    private String password;
    private RoleSchool role;
    private LocalDate birthDate;
}
