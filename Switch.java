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
System.out.print("Please enter a day number:");
int dayNumber = scan.nextInt();

switch(dayNumber) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid day number.");
}

scan.close();
    }
}