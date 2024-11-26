public class PersonPrivate {
    private String name; //can't be accessed directly from outside the class 
    private int age; 
    private double height;
    private double weight;

    // Constructor to initialize the object
    public PersonPrivate(String name, int age, double height, double weight) { 
        this.name = name; 
        this.age = age; 
        this.height = height; 
        this.weight = weight; 
    }

// Method to display details 
public void displayDetails() { 
    double bmi = weight/(height+age);
    System.out.println ("Name: " + name);
    System.out.println ("Age: " + age);
    System.out.println ("Height: " + height);
    System.out.println ("Weight: " + weight);
    System.out.println ("BMI is: " + bmi);
    }

    public static void main(String[] args) { 
        PersonPrivate person = new PersonPrivate("Tan", 20, 167, 70.0);
        //Display the details of the person
        person.displayDetails();
    }
}