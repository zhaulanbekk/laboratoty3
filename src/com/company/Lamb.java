package com.company;

public class Lamb {
    private String name;
    private int age;
    private int weight;

    public  Lamb(){

    }

    public Lamb(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\n=> Lamb: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight ;
    }
}
