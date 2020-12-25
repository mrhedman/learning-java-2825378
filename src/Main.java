import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat) {
            System.out.println("Playing same song again");

            String userInput = input.next();
            if (userInput.equals("Yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
        input.close();
    }
}
