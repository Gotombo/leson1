package com.company;

public class Main {


    public static void main(String[] args) {
        Shelter shelter = new Shelter("РОма", "Разакова 25А");
Dog ovcharka = new Dog("Мухтар", "Немецкая овчарка", new String[]{"Сидеть", "фАС"}, shelter, Color_enum.BLACK);
        System.out.println(ovcharka.getInfo());
        ovcharka.makeVoice("Gav GAv",1);
        System.out.println("---------------------");
        System.out.println("Dog mumber 2");
        Dog dogn = new Dog("Овчарка", "Русская овчарка", shelter, Color_enum.BLACK);
        dogn.makeVoice("Gav GAv",3);
        System.out.println(dogn.getInfo());
    }
}
