package com.zxelec.springbootstudy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Student {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    @JsonProperty(value = "size")
    private Integer age;

    @JsonIgnore
    private String password;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date createTime;


    public Student(String name, Integer age, String password, Date createTime) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.createTime = createTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
