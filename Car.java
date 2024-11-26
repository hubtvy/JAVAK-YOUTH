public class Car {
    private int manufactureYear; //can't be accessed directly from outside the class 
    private double price; 
    private String name;

    // Constructor to initialize the object
    public Car(String name, double price, int manufactureYear) { 
        this.name =name;
        this.price = price;
        this.manufactureYear = manufactureYear;
        
    }

// Method to display details 
public void displayDetails() { 
    double carvalue = price * manufactureYear;
    System.out.println ("Name: " + name);
    System.out.println ("Price: RM " + price);
    System.out.println ("Manufacture Year: " + manufactureYear);
    System.out.println ("Car Value : " + carvalue);
    }

    public static void main(String[] args) { 
        Car cardetails = new Car("Toyota", 100000 , 2016);
        //Display the details of the person
        cardetails.displayDetails();
    }
}