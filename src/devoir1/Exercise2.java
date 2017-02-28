package devoir1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Darius on 2/28/2017.
 */
public class Exercise2 {

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
        String password = name.substring(0, 2);
        int birhYear = Integer.parseInt(date.substring(date.length() - 4, date.length()));
        GregorianCalendar calendar = new GregorianCalendar();
        int current = calendar.get(Calendar.YEAR);
        password += current - birhYear;
        password += surname.substring(surname.length() - 2, surname.length());
        password = password.toLowerCase();
        System.out.print(password);
    }

}
