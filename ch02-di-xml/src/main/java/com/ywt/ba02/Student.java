package com.ywt.ba02;


/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/26 15:37
 */
public class Student {
    private String name;
    private int age;
    private School school;

    public void setSchool(School school) {
        this.school = school;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
