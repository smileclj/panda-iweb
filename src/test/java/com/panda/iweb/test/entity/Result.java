package com.panda.iweb.test.entity;

import com.panda.iweb.entity.Student;

public class Result<T> {
    private Integer id;
    private Student student;
    private T t;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
