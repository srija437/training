public class split {
    public static void main(String[] args) {
        String s1 = "Java,Python,C++";
        String[] arr= s1.split(":");
        for(String lang:arr){
            System.out.print(lang + " ");
        }
    }
}
