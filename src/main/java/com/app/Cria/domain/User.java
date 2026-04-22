package com.app.Cria.domain;

import com.app.Cria.domain.enums.Role;

import java.util.Objects;

public class User {

    private String CPF;

    private String password;

    private Role role;

    private Boolean firstAccess = true;

    public User() {
    }

    public User(String CPF, String password, Role role, Boolean firstAccess) {
        this.CPF = CPF;
        this.password = password;
        this.role = role;
        this.firstAccess = firstAccess;
    }

    public String getCPF() {
        return CPF;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Boolean getFirstAccess() {
        return firstAccess;
    }

    public void setFirstAccess(Boolean firstAccess) {
        this.firstAccess = firstAccess;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getCPF(), user.getCPF()) && Objects.equals(getPassword(), user.getPassword()) && getRole() == user.getRole() && Objects.equals(getFirstAccess(), user.getFirstAccess());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCPF(), getPassword(), getRole(), getFirstAccess());
    }
}
