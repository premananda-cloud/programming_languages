public class Car{
    String brand;
    String color;
    
    Car(String brand, String color)
    {
        this.brand = brand;
        this.color = color;
    }

    void drive(){
        System.out.println(brand  + " car is color is " + color);
    }
}