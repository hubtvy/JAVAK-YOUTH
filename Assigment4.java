public class Assigment4{
    public static void main(String [] args){
        String[][] matrix = new String[3][3];

        //matrix[0][0] ="Toyota Hilux"; matrix[0][1]= "Nissan";matrix[0][2] = "Honda City";
        //matrix[0][1] ="Perodua Myvi"; matrix [1][1] ="Proton Saga"; matrix [1][2] = "BMW X1";
        //matrix[0][2] =" Perodua Axia"; matrix[2][1]= " Perodua Alza"; matrix [2][2] = "Perodua Bezza";

        String[][] cars={
            {"2015", "Toyota Hilux"},
            {"2019", "Honda City"},
            {"2020", "Perodua Alza"}
        };
       
        /*int[][] carPriceMatrix = {
            {100000, 80000, 46000},
            {42000, 50000, 120000},
            {32000, 88000, 140000}
        };*/

        double []prices ={100000,50000,140000};

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > 50000) {
                System.out.println("Model: " + cars[i][1] + " (" + cars[i][0] + "), Price: RM " + prices[i]);
            }
        }
        //cars[i][1] refers to the car model stored in the second column of the cars array (index 1 for each row i//
        //cars[i][0]:refers to the year of the car stored in the first column of the cars array (index 0 for each row i//
        /*When i = 0:

        cars[i][1] would be "Toyota Hilux"
        cars[i][0] would be "2015
        */
    }
}
