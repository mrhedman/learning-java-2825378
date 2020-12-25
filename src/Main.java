import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();

        if (inputtedNum >= 5 && inputtedNum <= 10) {
            System.out.println("Print your shoe selection will make you happy today");

        } else {
            System.out.println("Enjoy the good luck a friend brings you");
        }
        scanner.close();
    }
}
