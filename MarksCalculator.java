import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float totalMarks = 300; // Total possible marks for three subjects
        float obtainedMarks = 0;
        float[] marks = new float[3];
        
        // Input: Take marks obtained (out of 100) in each subject
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextFloat();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Enter valid marks between 0 and 100.");
                return;
            } else if (marks[i] < 33) {
                System.out.println("Fail in subject " + (i + 1) + ". Better luck next time!");
                return;
            }
            obtainedMarks += marks[i];
        }
        
        // Calculate Total Marks: Sum up the marks obtained in all subjects
        float totalObtainedMarks = obtainedMarks;
        
        // Calculate Average Percentage: Divide the total marks by the total number of subjects
        float averagePercentage = (totalObtainedMarks / totalMarks) * 100;
        
        // Grade Calculation: Assign grades based on the average percentage achieved
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 75) {
            grade = 'B';
        } else if (averagePercentage >= 60) {
            grade = 'C';
        } else if (averagePercentage >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display Results: Show the total marks, average percentage, and the corresponding grade to the user
        System.out.println("Total Marks Obtained: " + totalObtainedMarks + "/" + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
