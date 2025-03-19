import java.util.Scanner;

public class lab2q5 {

    public static void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        displayDetails(marks);
    }

    public static void displayDetails(int[] marks) {
        for (int i = 0; i < 3; i++) {
            String grade = calculateGrade(marks[i]);
            System.out.println("Subject " + (i + 1) + " grade: " + grade);
        }
    }

    public static String calculateGrade(int mark) {
        if (mark >= 90) {
            return "A";
        } else if (mark >= 80) {
            return "B";
        } else if (mark >= 70) {
            return "C";
        } else if (mark >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        acceptDetails();
    }
}
