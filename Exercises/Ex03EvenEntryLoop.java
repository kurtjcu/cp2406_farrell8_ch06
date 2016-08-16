import java.util.Scanner;

/**
 * Created by kurt on 16/08/2016.
 */
public class Ex03EvenEntryLoop {

    public static void main(String[] args) {
        Ex03EvenEntryLoop test = new Ex03EvenEntryLoop();
        test.testEntry();
    }

    private void testEntry() {
        int userNum;
        boolean keepGoing = true;
        Scanner input = new Scanner(System.in);


        while (keepGoing) {
            System.out.print("Please enter an even number or \"999\" to quit: ");
            userNum = input.nextInt();

            if (userNum == 999) {
                keepGoing = false;
            } else if (userNum % 2 == 0) {
                //even
                System.out.println("Good Job!");
            } else {
                System.out.println("Not Even!");
                // not even...
            }

        }
        System.out.println("Goodbye...");
    }
}
