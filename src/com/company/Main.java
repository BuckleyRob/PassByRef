package com.company;

public class Main {
//Main method
    public static void main(String[] args) {
	    Dog myDog = new Dog("Buster");
        System.out.println("Before:" + myDog.name);
        ChangeName(myDog);
        System.out.println("After: " + myDog.name);

        int b = 3;
        System.out.println("Before:" + b);
        ChangeTheNumber(b);
        System.out.println("After: " + b);
    }

    public static void DoChangeNumber(int x){
    //Change NUmber methdo
    public static void ChangeTheNumber(int x){
        x = 6;
    }
	//CHange name method


    public static void DoChangeName(Dog ninjas){
        ninjas.name = "Rex";
    }
}

class Dog{
    String name;

    public Dog(String name) {
        this.name = name;
    }
}
