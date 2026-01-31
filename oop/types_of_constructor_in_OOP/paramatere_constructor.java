package oop.types_of_constructor_in_OOP;
class Student{
    String name;
    int age;


    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non-paramaterize constructor
    Student(){
        System.out.println("non-paramaterize constructor called!!");
    }

}

public class paramatere_constructor{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.age = 18;
        s1.name = "Aaditya sah";

        s1.printInfo();
    }
}