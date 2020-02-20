package Class3;

import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args){

        //exit hune bahek aru case process repeat hos vanera
        while(true){
            System.out.println("\n 1.Add \n 2.Sub \n 3.Mul \n 4.Div \n 5.Quit ");
            Scanner input=new Scanner(System.in);
            System.out.println("Please Enter your choice number= ");
            int choice=input.nextInt();
            if (choice > 4) {
                System.exit(0);
            }
            Calculator calobject=new Calculator();
            System.out.println("Enter first number = ");
            calobject.num1=input.nextInt();
            System.out.println("Enter second number = ");
            calobject.num2=input.nextInt();

            switch (choice){
                case 1:
                    int result1=calobject.add();
                    System.out.println("The sum = "+result1);
                    break;
                case 2:
                    int result2=calobject.sub();
                    System.out.println("The difference = "+result2);
                    break;
                case 3:
                    int result3=calobject.mul();
                    System.out.println("The product = "+result3);
                    break;
                case 4:
                    double result4=calobject.div();
                    System.out.println("The quotient = "+result4);
                    break;
                default:
                    System.out.println("Unknown Error");


            }

        }



    }
}
