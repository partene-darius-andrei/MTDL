package devoir1;

import java.util.Scanner;

/**
 * Created by Darius on 2/28/2017.
 */
public class Exercise3 {

    private static int number;
    private static double price;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of tickets: " );
        number = input.nextInt();

        System.out.print("Enter cost of ticket: " );
        price = input.nextDouble();

        getCost();
    }

    private static void getCost(){
        System.out.print("Total cost: " + number * price);
    }
}
