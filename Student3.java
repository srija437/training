public class Student3 {

    int id;
    void setId(int id)
    {
        this.id=id;
    }
    public static void main(String[] args)
    {
        Student3 obj=new Student3();
           obj.setId(362);
        System.out.println(obj.id);
    }
}