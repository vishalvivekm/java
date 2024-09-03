package com.JavaProgrammingCourse;

public class InterFaceDemo {
    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
        obj.show();
    }
}

interface printable{
     void print();
}
interface showable{
    void show();
}
class A6 implements printable, showable{
    public void print(){
        System.out.println("print something");
    }
    public void show(){
        System.out.println("show something");
    }
}