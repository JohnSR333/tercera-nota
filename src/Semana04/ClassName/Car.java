package Semana04.ClassName;

public class Car {
    String brand;
    int year;
    
    //Constructor
    public Car (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void ShowInfo() {
        System.out.println("La marca es : " + brand + " El año del auto es : " + year);    
    }
}
