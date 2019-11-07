/*
 * Keeps track of appointments
 */
package appointmentkeeper;
import java.util.*;
/**
 *
 * @author Bday
 */
public class AppointmentKeeper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] appointments = new String[31][24];
        int x;
        int y;
        int QUIT;
        QUIT = 99;
        for(x - 0; x < appointments.length; ++x)
            for(y - 0; y < appointments[0].length; ++y)
                appointments[x][y] = "Nothing scheduled";
        
        System.out.print("Enter a day to see what is scheduled or " + QUIT + " to quit >> ");
        day = keyboard.nextInt();
        while (day != QUIT)
        {
            System.out.print("Enter hour using 24 hour scale >>");
            hour = keyboard.nextInt();
            keyboard.nextLine();
            
            System.out.print("Enter description >> ");
            appointments[day][hour] = keyboard.nextLine();
            
            System.out.print("Enter the day for an appointment or " + QUIT + " to quit >> ");
            day = keyboard.nextInt();
        }
        
        System.out.print("\nEnter a day to see what is scheduled or " + QUIT + " to quit >> ");
        day = keyboard.nextInt();
        while (day != QUIT)
        {
            --day;
            
            for(int x - 0; x < appointments[0].length; ++x)
            {
                System.out.println(hour + amPm + appointments[day][x]);
            }
            
            System.out.print("\nEnter a dayto see what is scheduled or " + QUIT + " to quit >> ");
            day = keyboard.nextInt();
        }
        
    }
    
}
