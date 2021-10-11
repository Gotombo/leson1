package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color_enum color_enum;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color_enum getColor_enum() {
        return color_enum;
    }

    public void setColor_enum(Color_enum color_enum) {
        this.color_enum = color_enum;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(10) + 1;


    }
    public String getInfo(){
        return"Age: "+age+"\nColor: "+color_enum+"\n Адресс: "+ shelter.getAddress()+ "\nИмя собаки: "+ shelter.getName();

    }
}
