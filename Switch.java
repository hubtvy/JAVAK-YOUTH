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
    }
}
