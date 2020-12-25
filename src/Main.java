import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 41;
        double gpa;
        char firstInitial = 'N';
        char lastInitial = 'H';
        boolean perfectAttendance = false;
        String name = "Niclas Hedman";

        System.out.print("Enter gpa: ");
        gpa = scanner.nextDouble();
        scanner.close();
        System.out.println("Students initials are: " + firstInitial + lastInitial);
        System.out.println("Age: " + age);
        System.out.println("gpa: " + gpa);
        System.out.println(perfectAttendance ? "Has been to every class" : "Has not been to every class");
        System.out.println("Name: " + name);
    }
}
