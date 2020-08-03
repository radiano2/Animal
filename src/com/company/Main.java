package com.company;



public class Main {

    public static void main(String[] args) {
        Animal object1 = new Animal("Cheetah",15,8);

        String a = object1.getName();
        int b = object1.getSpeed();
        int c = object1.getAge();

        System.out.print("Name of the animal - ");
        System.out.println(a);
        System.out.print("Speed of the animal - ");
        System.out.println(b);
        System.out.print("The age of the animal - ");
        System.out.println(c);
    }
}
