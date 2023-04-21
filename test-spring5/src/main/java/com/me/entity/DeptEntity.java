package com.me.entity;

public class DeptEntity {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public DeptEntity() {
    }

    @Override
    public String toString() {
        return "DeptEntity{" +
                "department='" + department + '\'' +
                '}';
    }
}
