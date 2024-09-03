package com.JavaProgrammingCourse;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.display();
        dog.speak();
    }
}

abstract class Animal {
    void display() {
        System.out.println("I'm a animal");
    }
   abstract void speak();
}
class Dog extends Animal {
    void speak(){
        System.out.println("I'm a dog");
    }
}