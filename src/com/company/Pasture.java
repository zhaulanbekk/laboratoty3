package com.company;

import java.util.Arrays;

public class Pasture {
    private  String name;
    private String address;
    private  String shepherdName;
    private Cow[] cows;
    private Horse[] horses;
    private Lamb[] lambs;

    public Pasture() {
    }

    public Pasture(String name, String address, String shepherdName, Cow[] cows, Horse[] horses, Lamb[] lambs) {
        this.name = name;
        this.address = address;
        this.shepherdName = shepherdName;
        this.cows = cows;
        this.horses = horses;
        this.lambs = lambs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShepherdName() {
        return shepherdName;
    }

    public void setShepherdName(String shepherdName) {
        this.shepherdName = shepherdName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Lamb[] getLambs() {
        return lambs;
    }

    public void setLambs(Lamb[] lambs) {
        this.lambs = lambs;
    }

    @Override
    public String toString() {
        return "\t\t\t\t~~~ Pasture ~~~\n" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", shepherdName='" + shepherdName + '\'' +
                ",\n\t\t\t\t =COWS=" + Arrays.toString(cows) +
                ",\n \t\t\t\t=HORSES=" + Arrays.toString(horses) +
                ", \n\t\t\t\t=LAMBS=" + Arrays.toString(lambs);
    }
}
