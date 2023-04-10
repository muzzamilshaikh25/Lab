/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". 
 Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". 
 Create an object of the Car class and call both the "drive" and "honk" methods.*/ 
 
package Lab;

class Vehic {
    String brand;
    String model;
    int year;

    public void drive() {
        System.out.println("Drive");
    }
}

class Car extends Vehic {
    String color;

    public void honk() {
        System.out.println("Honk");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "BMW ";
        car.model = "BMW-X7";
        car.year = 2023;
        car.color = "Carbon Black";

        System.out.println("--------Car details--------");
        System.out.println("Brand: " + car.brand);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Color: " + car.color);

        car.drive();
        car.honk();
    }
}