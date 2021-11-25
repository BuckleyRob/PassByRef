package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog myDog = new Dog("Rover");
        System.out.println("Before:" + myDog.name);
        ChangeName(myDog);
        System.out.println("After: " + myDog.name);

        int b = 3;
        System.out.println("Before:" + b);
        ChangeNumber(b);
        System.out.println("After: " + b);
    }

    public static void ChangeNumber(int x){
        x = 6;
    }
    public static void ChangeName(Dog ninjas){
        ninjas.name = "Rex";
    }
}

class Dog{
    String name;

    public Dog(String name) {
        this.name = name;
    }
}