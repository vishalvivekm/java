package com.JavaProgrammingCourse;

public class SimpleClass {

    public static void main(String []args) {
        char ch = '';
        System.out.println("hello everybody");
        Student obj = new Student();

        obj.setStudentDetails("Arthur", "Dayne", 4400, 34343434);
        //System.out.println(obj.phoneNumber);
        System.out.println(obj.getName());
        Student std = obj.getStudent();
        System.out.println(std.getName());
        System.out.println(std.getAge());
    }
    public static void display() {
        System.out.println("hey there from java programming course package");
    }
}

class Student {
    private String firstName, lastName; // default package-private
    private int age, phoneNumber;

    public void setStudentDetails(String firstName, String lastName, int Age, int phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        age = Age;
        this.phoneNumber = phoneNumber;
    }
    Student getStudent() {
        return this;
    }
    String getName(){
        return firstName + " " + lastName;
    }
    public int getAge() {
        return age;
    }
}

/**
 * public class SimpleClass {

    public static void main(String []args) {
        System.out.println("hello everybody");
        Student obj = new Student();
        obj.phoneNumber = 343443;
        obj.age = 34;
        obj.firstName = "Arthur";
        obj.lastName = "Dayne";
        System.out.println(obj.phoneNumber);
    }
}
class Student {
     String firstName, lastName; // default package-private
     int age, phoneNumber;

}

 * 
 */