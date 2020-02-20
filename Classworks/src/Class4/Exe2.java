package Class4;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        int no;

        boolean retry = true;

        while (true) {


            if (retry==true){

            System.out.println("Please Enter your Age: ");

            }

            try {

                 no = new Scanner(System.in).nextInt();
                 break;



            } catch (Exception e) {
                System.out.println("Please Enter number only ");
                retry = false;


            }


        }
        System.out.println("Your Age is "+ no);
    }
}
