import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Hailey Kotvis
 * @version 2.0
 */
public class FileIO {
    // TimeFactory tf = new TimeFactory();
    //ArrayList<String> tickets = new ArrayList<>();
    String file = "Unit3Project/parking.txt";

    public void write(ArrayList tickets) throws IOException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");

        while (scanner.hasNextLine()) {
            tickets.add("\n" + scanner.nextLine());
        }

        scanner.close();
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        //printWriter.print(tf.getHours()+ " hours, from " + tf.getTimeIn() + " am - " +tf.getTimeOut() + " pm");

        for (Object t : tickets) {
            printWriter.print(t + " ");
        }
        printWriter.println("");
        printWriter.close();
    }

    public void read() throws IOException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();

    }

    public int getNumOfTix() throws IOException {
        int numOfTix = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                    numOfTix++;
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return numOfTix;
    }

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

    public String getOut() throws IOException{
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");
        String time = "";
        if(scanner.hasNextLine()){
            scanner.next();
            time = scanner.next();
            //System.out.print(scanner.next());
            scanner.nextLine();
        }
        scanner.close();
        return time;
    }
    public String getHrs() throws IOException{
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(" ");
        String time = "";
        if(scanner.hasNextLine()){
            scanner.next();
            scanner.next();
            time = scanner.next();
            //System.out.print(scanner.next());
            scanner.nextLine();
        }
        scanner.close();
        return time;
    }
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

    public int getTotal() throws IOException{
        int cash = 0;
        String add="";
        String substring ="";

                    Scanner scanner = new Scanner(new File(file));
                    int sub2 = 0;
        int newNum = 0;
                    while(scanner.hasNextLine()){
                        add = scanner.nextLine();
                        //System.out.println(add);
                       if(add.contains(" C")){
                           int iend = add.indexOf("C");
                           int other = iend - 3;

                           if(iend != -1){
                               substring =add.substring((other), iend).trim();
                               sub2 = Integer.parseInt(substring);
                               //sub2 += sub2;
                           }
                           //System.out.println(add.substring(add.indexOf("C") - 3));

                           newNum +=sub2;
                          // System.out.println(iend);
                           //System.out.println(other);
                          // System.out.println(newNum);
                          // System.out.println(substring);

                            //cash += (scanner.nextInt());

                        }

                       else{
                           //System.out.println("Does not contain");
                           // add = scanner.nextLine();
                           // System.out.println(add);
                            //
                           // System.out.println("does not contain c");
                        }
                    }
                    cash = newNum;

        return cash;
    }

}
