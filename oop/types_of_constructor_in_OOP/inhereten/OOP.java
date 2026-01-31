package oop.types_of_constructor_in_OOP.inhereten;
class Shape{
    String color;
}

class Triangle extends Shape{

}

public class OOP{
    public static void main(String args[]){
    Triangle t1 = new Triangle();
    t1.color = "red";
}
}