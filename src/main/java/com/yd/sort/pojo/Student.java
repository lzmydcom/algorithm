package com.yd.sort.pojo;

import com.yd.sort.operation.ElementValue;

public class Student implements ElementValue {

    private Integer value;

    private String name;

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Student{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
