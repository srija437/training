public class Test {
    public static void main(String[] args)
    {
        employee e1=new employee();
        employee e2=new employee();

        e1.empId=362;
        e1.name="Teju";

        e2.empId=363;
        e2.name="Vaishu";

        System.out.println(e1.empId+" "+e1.name);
        System.out.println(e2.empId+" "+e2.name);

    }
}