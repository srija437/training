public class Student1 {
    //instance variables
    String name;
    int rollno;
    /*n  and a are local variables created
    inside constructor
     */
    Student1(String n, int a){
        name =n;
        rollno = a;
    }
    void display(){
        //local variables are craeted inside the method
        int marks = 99;
        System.out.println(name+" "+marks+" "+rollno);
    }
    public static void main(String[] args){
        Student1 obj = new Student1("Sneha reddy", 517);
        obj.display();
    }
}