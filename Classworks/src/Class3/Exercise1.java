package Class3;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){

        int age;
        int year;
        Scanner input=new Scanner(System.in);
        Calendar cal= new GregorianCalendar();

        System.out.println("How old are you?");
        age= input.nextInt();
        System.out.println("When do you plan to retire? Please enter the Year.");
        year= input.nextInt();

        int retire=year-cal.get(Calendar.YEAR);
        System.out.println("\n Nice,You will retire at the age of "+(age+retire));


    }
}
