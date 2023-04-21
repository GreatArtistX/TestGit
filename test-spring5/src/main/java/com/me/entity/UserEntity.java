package com.me.entity;

public class UserEntity {
    private int id;
    private String name;
    public void addUser(){
        System.out.println("添加用户");
    }
    private String test(String name,int id){
        System.out.println("私有方法test");
        return name+","+id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserEntity() {
        System.out.println("无参构造方法初始化....");
    }

    public UserEntity(int id, String name) {
        System.out.println("有参构造方法初始化....");
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
