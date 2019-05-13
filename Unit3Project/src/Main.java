import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the main method, asks if they are trying to enter the garage or exit
 * Simulates which machine you drive up to
 *   @author Hailey Kotvis
 *   @version 2.0
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        boolean flag = false;
        while (flag == false) {
            System.out.println("\nDo you want to enter or exit the parking garage?");
            System.out.println("1 - Enter");
            System.out.println("2 - Exit ");
            String choice = in.nextLine();
            if (choice.equals("1")) {
                ChooseMachine.choose(ChooseMachine.MeasurementSystem.CHECKIN);
            } else if (choice.equals("2")) {
                flag = ChooseMachine.choose(ChooseMachine.MeasurementSystem.CHECKOUT);

            }
            else{
                System.out.println("Please enter a 1 or 2");
                flag = false;
            }
        }
    }
}

