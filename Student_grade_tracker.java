import java.util.ArrayList;
import java.util.Scanner;

 class Student_Grade_Tracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter student grades (type -1 to finish):");

        while (true) {
            int grade = scanner.nextInt();

            if (grade == -1) break;  // Stop input when -1 is entered
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            int highest = grades.get(0);
            int lowest = grades.get(0);
            int sum = 0;

            for (int grade : grades) {
                sum += grade;
                if (grade > highest) highest = grade;
                if (grade < lowest) lowest = grade;
            }

            double average = (double) sum / grades.size();

            System.out.println("\n--- Grade Summary ---");
            System.out.println("Total Students: " + grades.size());
            System.out.println("Average Score: " + average);
            System.out.println("Highest Score: " + highest);
            System.out.println("Lowest Score: " + lowest);
        }

        scanner.close();
    }
}
