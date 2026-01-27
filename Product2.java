public class Product2 {
    private double price;
    public void setPrice(double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }
    public static void main(String[] args)
    {
        Product2 obj=new Product2();
        obj.setPrice(27);
        System.out.println(obj.getPrice());
    }
}