package hotelProject;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {

    public static void main ( String[] args ) throws FileNotFoundException {

        Management_Of_Reservations3 mange = new Management_Of_Reservations3 ();
        Scanner in =new Scanner ( System.in );

        System.out.println (" Welcome to the luxury hotel >>>>>");
        int s = 0;
         do {
             System.out.println ();
             System.out.println ("Number 1 to inquire about Rooms");
             System.out.println ("Number 2 to inquire about Reservations");
             System.out.println ("Number 3 to add a  Reservations");
             System.out.println ("Number 4 to cancel a  Reservations");
             System.out.println ("Number 0  is exit");
             System.out.println ("\nInput Your Choies ");

             s=in.nextInt ();
             switch (s)
             {

                 case 1:
                     mange.printRoom ();
                     break;

                 case 2:
                     mange.printReservations ();
                     break;

                 case 3:
                     mange.addReservations ();
                     break;

                 case 4:
                     mange.cancelReservations ();
                     break;

                 case 0:
                     System.exit ( 0 );

                 default:
                     System.out.println ("your choies is incorrect");
             }
         }while (s!=0);
    }
}
