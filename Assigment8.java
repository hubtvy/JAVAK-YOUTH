//Pass the person age and name and hight and weight using scanner, use the encapsulation to have set and 
//get data and use the following formula to calculate bmi: (height-100)/weight

import java.util.Scanner;

public class Assigment8{

    private String name;
    private int age;
    private double height;
    private double weight;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
    }
    public void setHeight(double height){
        if (height > 0){
            this.height = height;
        }
    }
      public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public double calBMI() {
        double heightInMeters = height / 100.0; 
        return Math.round((weight / (heightInMeters * heightInMeters)) * 100.0) / 100.0;
    }
     

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Assigment8 person = new Assigment8();

    System.out.print("Enter your name: ");
    String name=scan.nextLine();
    person.setName(name);

    System.out.print("Enter your age: ");
    int age=scan.nextInt();
    person.setAge(age);

    System.out.print("Enter your height: ");
    double height=scan.nextInt();
    person.setHeight(height);

    System.out.print("Enter your weight: ");
    double weight=scan.nextInt();
    person.setWeight(weight);

    double bmi =person.calBMI();

    System.out.println("The person name is: " + person.getName() + " and he/she is: " + person.getAge() + " and his/her bmi is " + bmi);

    scan.close();
    }
}