public class Car {
    //instance variable
    String brand;
    int speed;
    //instance method
    void drive(){
        System.out.println(brand + " is driving speed "+ speed + " "+ " km/h");
    }
    public static void main(String[] args){
        Car obj = new Car();
        obj.brand="Honda";
        obj.speed=90;
        obj.drive();
    }
}