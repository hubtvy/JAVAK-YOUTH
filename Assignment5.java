/*Use scanner to get the prices of the 5 different cars from the terminal and 
if the value of the car is equal or above 70000 RM, put them in the matrix of 22 which shows the value, "VIP", "2024", "pre-order" and 
if the value is below the 70000 put them in the matrix of 22 which shows the value, "Cheap", "old", "for sale" */

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner carsScanner = new Scanner(System.in);

        String[] carNames = new String[5];
        int[] prices = new int[5];

        String[][] NewCars = new String[5][3];  
        String[][] OldCars = new String[5][3];  

        System.out.println("Please enter the name and the car prices for 5 different cars");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter car name: ");
            carNames[i] = carsScanner.nextLine();

            System.out.print("Enter car price for " + carNames[i] + ": ");
            prices[i] = carsScanner.nextInt();
            carsScanner.nextLine(); 

            
            if (prices[i] < 70000) {
                System.out.println("Car: " + carNames[i] + ", Price: RM " + prices[i]);
                System.out.println("Value: Cheap, old, for sale");
            
                OldCars[i][0] = carNames[i];
                OldCars[i][1] = String.valueOf(prices[i]);
                OldCars[i][2] = "Cheap, old, for sale";
            } else {
                System.out.println("Car: " + carNames[i] + ", Price: RM " + prices[i]);
                System.out.println("Value: VIP,2024, pre-order");

                NewCars[i][0] = carNames[i];
                NewCars[i][1] = String.valueOf(prices[i]);
                NewCars[i][2] = "VIP,2024, pre-order";
            }
        }

        System.out.println("New Cars:");
        for (int i = 0; i < 5; i++) {
            if (NewCars[i][0] != null) {
                System.out.println("Car: " + NewCars[i][0] + ", Price: RM " + NewCars[i][1] + ", Value: " + NewCars[i][2]);
            }
        }

        System.out.println("Old Cars:");
        for (int i = 0; i < 5; i++) {
            if (OldCars[i][0] != null) {
                System.out.println("Car: " + OldCars[i][0] + ", Price: RM " + OldCars[i][1] + ", Value: " + OldCars[i][2]);
            }
        }

        carsScanner.close();
    }
}
