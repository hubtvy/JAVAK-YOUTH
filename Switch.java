import java.util.Scanner;

public class Switch {

    public static void main(String []args){

        int dayofweek=3;
        String dayname;

        switch(dayofweek){
        case 1: 
            dayname ="Monday";
            break;
        case 2:
            dayname="Tuesday";
            break;

        case 3:
            dayname="Wednesday";
            break;

        case 4:
            dayname="Thursday";
            break;
        
        case 5:
            dayname="Friday";
            break;
        
        case 6:
            dayname="Sunday";
            break;

        case 7:
            dayname = "Sunday";
            break;

        default:
            dayname = "Invalid day";
            break;
    }
    System.out.println("Day of the week: " + dayname);
    

//Use Scanner to get the day number and the result of the switch must be portrayed in the console.

Scanner scan = new Scanner (System.in);

String dayNames;

System.out.print("Please enter a day number:");
int dayNumber = scan.nextInt();

switch(dayNumber) {
    case 1: 
            dayNames ="Monday";
            break;
        case 2:
            dayNames="Tuesday";
            break;

        case 3:
            dayNames="Wednesday";
            break;

        case 4:
            dayNames="Thursday";
            break;
        
        case 5:
            dayNames="Friday";
            break;
        
        case 6:
            dayNames="Sunday";
            break;

        case 7:
            dayNames = "Sunday";
            break;

        default:
            dayNames = "Invalid day";
            break;
    }
    System.out.println("Day of the week: " + dayNames);
   
scan.close();
    }
}