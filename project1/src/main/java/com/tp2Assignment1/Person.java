package com.tp2Assignment1;

/**
 * Created by student on 2016/03/12.
 */
public class Person {
    String name;
    int age;

    Person(String x,int y){
        name = x;
        age = y;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
