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

            System.out.println("Do you want to enter or exit the parking garage?");
            System.out.println("1 - Enter");
            System.out.println("2 - Exit ");
            if(in.nextLine().equals("1")){
                CheckIn c = new CheckIn();
                c.displayScreen();
            }
            else {
                CheckOut o = new CheckOut();
                o.displayScreen();
                //o.displayCharge();
            }
    }
}

