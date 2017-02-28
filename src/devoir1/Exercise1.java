package devoir1;

import java.util.Scanner;

/**
 * Created by Darius on 2/28/2017.
 */
public class Exercise1 {

    private static String name, surname, date;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: " );
        name = input.next();
        System.out.println("Name accepted " + name);

        System.out.print("Enter Surname: " );
        surname = input.next();
        System.out.println("Surname accepted " + surname);

        System.out.print("Enter date (dd/mm/yyyy): " );
        date = input.next();
        System.out.println("Date accepted " + date);

        getPassword();
    }

    private static void getPassword(){
        String password = name.substring(0, 2) + date.substring(date.length() - 2, date.length()) + surname.substring(surname.length() - 2, surname.length());
        password = password.toLowerCase();
        System.out.print(password);
    }
}
