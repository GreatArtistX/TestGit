package com.me.entity;

public class EmpEntity {
    private int id;
    private String name;
    private int age;
    private DeptEntity deptEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DeptEntity getDeptEntity() {
        return deptEntity;
    }

    public void setDeptEntity(DeptEntity deptEntity) {
        this.deptEntity = deptEntity;
    }

    @Override
    public String toString() {
        return "EmpEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", deptEntity=" + deptEntity +
                '}';
    }
}
