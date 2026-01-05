public class Laptop {
//    String brand;
//    int price;


    String brand;
    int price;
    Laptop(String brand,int price)
    {
        this.brand=brand;
        this.price=price;
    }
    public static void main(String[] args)
    {
//        Laptop l=new Laptop();
//
//        System.out.println(l.brand);
//        System.out.println(l.price);

        Laptop obj=new Laptop("LENOVA",50000);
        System.out.println(obj.brand+" "+obj.price);

    }
}