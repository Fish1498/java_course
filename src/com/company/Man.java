package com.company;

import java.util.Objects;
import java.util.Scanner;
//Ex 1 - class man
public class Man extends Car{
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(Integer Age){
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public void setName(){
        this.name=name;
    }

    private int age;
    public void set_man(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void walk() {
        System.out.printf("%s walks.\n", name);
    }
    public void eat() {
        System.out.printf("%s eats.\n", name);
    }

    public String toString(){
        return "Man " + name + " " + age;
    }
}
