import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * File Output Class
 * Reads from the file to get information
 *  * @author Hailey Kotvis
 *  * @version 2.0
 */
public class FileOutput {

    String file = "Unit3Project/parking.txt";

    /**
     * Reads file for lines with a "C" to indicate it is a checkin ticket
     * @return int numOfCheckIns which is how many people have checkedin/out and payed
     * @throws IOException
     */
    public int getNumOfCheckIns() throws IOException {
        int numOfCheckIns = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.contains("C")) {
                    numOfCheckIns++;
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return numOfCheckIns;
    }

    /**
     * Reads from file to find all lines that contain "L" to indicate a lost ticket and adds them up
     * @return int getNumOfLostTix which is the amount of people who have checked out with a lost ticket
     * @throws IOException
     */
    public int getNumOfLostTix() throws IOException {
        int numOfLostTix = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.contains("L")) {
                    numOfLostTix++;
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return numOfLostTix;
    }

    /**
     * Reads file for all lines with "S" to indicate a special event ticket and adds them up
     * @return getNumOfSpecialEvents which is number of people who have check in for a special event
     * @throws IOException
     */
    public int getNumOfSpecialEvents() throws IOException {
        int numOfSpecialEv = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.contains("S")) {
                    numOfSpecialEv++;
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return numOfSpecialEv;
    }


    /**
     * This will read from file and gets the time from the file that someone checks in
     * @return String time which represents the time someone checked in
     * @throws IOException
     */
    public String getIn() throws IOException{
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");
        String time = "";
        if(scanner.hasNextLine()){
            time = scanner.next();
            scanner.nextLine();
        }

        scanner.close();
        return time;
    }

    /**
     * This will read from file to get the time a customer checks out of garage
     * @return String time which represents when someone checked out
     * @throws IOException
     */
    public String getOut() throws IOException{
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");
        String time = "";
        if(scanner.hasNextLine()){
            scanner.next();
            time = scanner.next();
            scanner.nextLine();
        }
        scanner.close();
        return time;
    }

    /**
     * Reads from file to get number of hours parked which is calculated in TimeFactory
     * @return String hours which is how many hours someone parked
     * @throws IOException
     */
    public String getHrs() throws IOException{
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");
        String hours = "";
        if(scanner.hasNextLine()){
            scanner.next();
            scanner.next();
            hours = scanner.next();
            scanner.nextLine();
        }
        scanner.close();
        return hours;
    }

    /**
     * Reads from file to find the cash amount
     * @return String cash which is amount of money earned for hours parked
     * @throws IOException
     */
    public String getCash() throws IOException{
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");
        String cash = "";
        if(scanner.hasNextLine()){
            scanner.next();
            scanner.next();
            scanner.next();
            cash = scanner.next();

            scanner.nextLine();
        }
        scanner.close();
        return cash;
    }

    /**
     * Reads file for all checkout amounts and adds them up
     * @return int cash which is the total amount of money earned from checkouts
     * @throws IOException
     */
    public int getTotal() throws IOException{
        int cash = 0;
        String add="";
        String substring ="";

        Scanner scanner = new Scanner(new File(file));
        int sub2 = 0;
        int newNum = 0;
        while(scanner.hasNextLine()){
            add = scanner.nextLine();
            if(add.contains(" C")){
                int iend = add.indexOf("C");
                int ibegin = iend - 3;

                if(iend != -1) {
                    substring = add.substring((ibegin), iend).trim();
                    sub2 = Integer.parseInt(substring);
                }

                newNum +=sub2;
            }

            else{}
        }
        cash = newNum;

        return cash;
    }
}
