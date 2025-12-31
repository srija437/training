public class PrintData {
    static void print(int a){
        System.out.println(a);
    }
    static void print(String s){
        System.out.println(s);
    }
    static void print(int a, String s){
        System.out.println(a+" "+s);
    }
    public static void main(String[] agrs){
        print(120);
        print("Srija Reddy");
        print(120, "Srija Reddy");
    }
}