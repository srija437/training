public class Member1
{
    String brand;
    int speed;

    void drive()
    {
        System.out.println(brand+" is driving at "+speed+ "km/h");
    }

    public static void main(String[] args){
        Member1 obj=new Member1();
        obj.brand="BMW";
        obj.speed=40;

        obj.drive();
    }
}