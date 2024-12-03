//Create new file that the scanner get the value for the switch, if the user choose 1 he/she will enter stage that 
//he/she needs to enter a value for 34 matrix, if the user choose 2 he/she will enter the stage that he/she need 
//to enter values for 23 matrix. The result of the user must be shown regardless of the option.

import java.util.Scanner;

public class Assigment7 {
    public static void main(String[] args) {

Scanner scan = new Scanner (System.in);

System.out.print("Please enter choose 1 or 2: ");
int number=scan.nextInt();

int[][] matrix1 = new int[3][4];
int[][] matrix2 = new int[2][3];

switch(number){
    case 1:
    for (int i = 0; i < matrix1.length; i++) {
        for (int j = 0; j < matrix1[i].length; j++) {
            System.out.print("Value [" + (i + 1) + "][" + (j + 1) + "]: ");
            matrix1[i][j] = scan.nextInt();
        }
    }
    System.out.println ("This was the value that u entered:");
    for (int i = 0; i < matrix1.length; i++) {
        for (int j = 0; j < matrix1[i].length; j++) {
            System.out.print(matrix1[i][j]+ " ");
    }
        System.out.println();
    }
    break;

    case 2:
    for (int i = 0; i < matrix2.length; i++) {
        for (int j = 0; j < matrix2[i].length; j++) {
            System.out.print("Value [" + (i + 1) + "][" + (j + 1) + "]: ");
            matrix2[i][j] = scan.nextInt();
        }
    }
    System.out.println ("This was the value that u entered:");
    for (int i = 0; i < matrix2.length; i++) {
        for (int j = 0; j < matrix2[i].length; j++) {
            System.out.print(matrix2[i][j]+ " ");
    }
        System.out.println();
    }
        break;
    default:
    System.out.println("Invalid number. Please enter the number between 1 or 2 only");
    break;
}


scan.close();
    }
}