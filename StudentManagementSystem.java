import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;
        String[] names = new String[n];
        int[] marks = new int[n];

        System.out.println("Enter names and marks of 10 students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " name: ");
            names[i] = sc.next();

            System.out.print("Student " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();
        }

        int max = marks[0];
        int topperIndex = 0;

        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
                topperIndex = i;
            }
        }

        System.out.println("\nTopper: " + names[topperIndex] + " with " + marks[topperIndex] + " marks");

        System.out.print("\nEnter student name to search: ");
        String searchName = sc.next();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Student found: " + names[i] + " scored " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        System.out.println("\nStudents with marks greater than 75:");
        for (int i = 0; i < n; i++) {
            if (marks[i] > 75) {
                System.out.println(names[i] + " - " + marks[i]);
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }
        double average = (double) sum / n;
        System.out.println("\nClass Average = " + average);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (marks[i] < marks[j]) {

                    int tempMarks = marks[i];
                    marks[i] = marks[j];
                    marks[j] = tempMarks;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        System.out.println("\nStudents sorted by marks (Descending):");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }

        sc.close();
    }
}
