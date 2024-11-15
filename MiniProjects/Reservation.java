import java.io.*;

public class Reservation // Class name should start with an uppercase letter
{ 
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
    int pno[] = new int[275];
    String name[] = new String[275];
    String phno[] = new String[275];
    int age[] = new int[275];
    int cl[] = new int[275];
    
    int pcount = 0;
    int pnum = 1;
    int max1 = 75; // Maximum tickets for AC
    int max2 = 125; // Maximum tickets for First class
    int max3 = 175; // Maximum tickets for Sleeper class

    public void doMenu() throws Exception {
        int cho = 0;
        do {
            System.out.println("\f");
            doHeading();
            System.out.println("1. Book ticket");
            System.out.println("2. Cancel ticket");
            System.out.println("3. Search passenger");
            System.out.println("4. Reservation chart");
            System.out.println("5. Display unbooked tickets");
            System.out.println("6. Exit");
            System.out.print("Please enter your choice: "); // Added print statement for clarity
            cho = Integer.parseInt(br.readLine());
            switch (cho) {
                case 1: doBook(); break;
                case 2: doCancel(); break;
                case 3: doSearch(); break;
                case 4: doDispList(); break;
                case 5: doDispUnbooked(); break;
                case 6: doExit(); break;
                default: System.out.println("Invalid choice");
            }
        } while (cho != 6);
    }

    private void doHeading() throws Exception {
        System.out.println("#########################################################");
        System.out.println("********* Railway Reservation For Kabul Express *********");
        System.out.println("#########################################################");
    }

    private void doBook() throws Exception {
        System.out.println("Please enter the class of ticket");
        System.out.println("1. AC\t 2. First\t 3. Sleeper\t");
        int c = Integer.parseInt(br.readLine());
        System.out.println("Please enter no. of tickets");
        int t = Integer.parseInt(br.readLine());
        
        if ((c == 1 && max1 >= t) || (c == 2 && max2 >= t) || (c == 3 && max3 >= t)) {
            for (int i = 0; i < t; i++) {
                pno[pcount] = pnum;
                System.out.print("Please enter your name: ");
                name[pcount] = br.readLine();
                System.out.print("Please enter your age: ");
                age[pcount] = Integer.parseInt(br.readLine());
                cl[pcount] = c;
                System.out.print("Please enter your phone number: ");
                phno[pcount] = br.readLine();
                
                pcount++;
                pnum++;
                System.out.println("Ticket successfully booked");
            }
            
            if (c == 1) {
                max1 -= t;
                System.out.println("Please pay Rs." + t * 1500);
            } else if (c == 2) {
                max2 -= t;
                System.out.println("Please pay Rs." + t * 1200);
            } else if (c == 3) {
                max3 -= t;
                System.out.println("Please pay Rs." + t * 1000);
            }
        } else {
            System.out.println("Not enough tickets available.");
        }
    }

    private void doCancel() throws Exception {
        int passengerFound = 0;
        System.out.print("Please enter your passenger number: ");
        int p = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < pcount; i++) {
            if (pno[i] == p) {
                passengerFound = 1;
                
                if (cl[i] == 1) {
                    max1++;
                    System.out.println("Please collect refund of Rs." + 1500);
                } else if (cl[i] == 2) {
                    max2++;
                    System.out.println("Please collect refund of Rs." + 1200);
                } else if (cl[i] == 3) {
                    max3++;
                    System.out.println("Please collect refund of Rs." + 1000);
                }
                
                // Shift remaining passengers
                for (int j = i; j < pcount - 1; j++) {
                    pno[j] = pno[j + 1];
                    name[j] = name[j + 1];
                    phno[j] = phno[j + 1];
                    age[j] = age[j + 1];
                    cl[j] = cl[j + 1];
                }
                
                pcount--; // Decrease passenger count
                break; // Exit loop after cancellation
            }
        }
        
        if (passengerFound == 0) {
            System.out.println("Passenger not found.");
        } else {
            System.out.println("Ticket successfully cancelled.");
        }
    }

    private void doDispList() throws Exception {
        displayPassengerList(1, "Passenger list in AC class", "AC class");
        displayPassengerList(2, "Passenger list in First class", "First class");
        displayPassengerList(3, "Passenger list in Sleeper class", "Sleeper class");
    }

    private void displayPassengerList(int ticketClass, String heading, String className) throws Exception {
        System.out.println(heading);
        System.out.println("pno \t name \t\t age \t phno");
        
        for (int i = 0; i < pcount; i++) {
            if (cl[i] == ticketClass) {
                System.out.printf("%d\t%s\t\t%d\t%s\n", pno[i], name[i], age[i], phno[i]);
            }
        }
    }

    private void doSearch() throws Exception {
        int passengerFound = 0;
        System.out.print("Please enter passenger number to search: ");
        int p = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < pcount; i++) {
            if (pno[i] == p) {
                passengerFound = 1;
                System.out.println("Detail found:");
                System.out.printf("Passenger No.: %d\nName: %s\nClass: %d\nPhone No.: %s\nAge: %d\n",
                        pno[i], name[i], cl[i], phno[i], age[i]);
            }
        }
        
        if (passengerFound == 0) {
            System.out.println("No such passenger.");
        }
    }

    private void doDispUnbooked() throws Exception {
        System.out.println("No. of booked tickets status:");
        System.out.printf("AC class: %d\nFirst class: %d\nSleeper class: %d\n", max1, max2, max3);
    }

    private void doExit() 
    {
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
              System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }

    public static void main(String[] args) throws Exception { // Added main method to run the program
        Reservation reservationSystem = new Reservation();
        reservationSystem.doMenu();
    }
}