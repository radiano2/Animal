package com.company;



public class Main {

    public static void main(String[] args) {
        Animal animal_object = new Animal("Cheetah",15,8);

        String a = animal_object.getName();
        int b = animal_object.getSpeed();
        int c = animal_object.getAge();

        System.out.print("Name of the animal - ");
        System.out.println(a);
        System.out.print("Speed of the animal - ");
        System.out.println(b);
        System.out.print("The age of the animal - ");
        System.out.println(c);
    }
}
