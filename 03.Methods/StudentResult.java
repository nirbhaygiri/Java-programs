import java.util.Scanner;

public class StudentResult {

    public static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public static double calculatePercentage(int total) {
        return total / 3.0;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 50) return "C";
        else return "Fail";
    }

    public static void displayResult(int total, double percentage, String grade) {
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = calculateTotal(m1, m2, m3);
        double percentage = calculatePercentage(total);
        String grade = getGrade(percentage);

        displayResult(total, percentage, grade);
        sc.close();
    }
}