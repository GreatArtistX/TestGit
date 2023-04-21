package com.me.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StuEntity {
    private String[] arrays;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }


    public StuEntity() {
    }

    @Override
    public String toString() {
        return "StuEntity{" +
                "arrays=" + Arrays.toString(arrays) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                '}';
    }
}
