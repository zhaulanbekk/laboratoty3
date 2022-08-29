package com.company;

public class Cow {
    private String cowName;
    private int age;
    private int weight;

   public Cow(){

   }

    public Cow( String cowName, int age, int weight) {
        this.cowName = cowName;
        this.age = age;
        this.weight = weight;
    }

    public String getCowName() {
        return cowName;
    }

    public void setCowName(String cowName) {
        this.cowName = cowName;
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
        return " \n=> Cow: " +
                "cowName='" + cowName + '\'' +
                ", age=" + age +
                ", weight=" + weight ;
    }
}
