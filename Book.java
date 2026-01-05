public class Book {
    String title;
    int price;

    Book()
    {
        title="UNKNOWN";
        price=0;
    }
    Book(String title,int price)
    {
        this.title=title;
        this.price=price;
    }
    public static void main(String[] args)
    {
        Book b1=new Book();
        Book b2=new Book("JAVA OOP",500);

        System.out.println(b1.title+" "+b1.price);
        System.out.println(b2.title+" "+b2.price);
    }
}