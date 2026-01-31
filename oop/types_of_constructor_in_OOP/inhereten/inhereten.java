package oop.types_of_constructor_in_OOP.inhereten;
class Shape{
    public void area(){
        System.out.println("display area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

public class inhereten{

}