package Class2.Arays;
//define array 'Ids with five numbers'

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {

        int[] Ids = {2, 8, 3, 4, 2, 3, 9, 7};
        //sum of arrays
         int sum = 0;
        for (int i = 0; i < Ids.length; i++) {
            sum = sum + Ids[i];
        }
        System.out.println("The sum is " + sum);
//        for (int num: Ids){
//            sum= sum + num;}
//            System.out.println("The sum of the Ids= "+sum);

        //average value
        double average = sum / Ids.length;
        System.out.println("The average value is " + average);

        //repeated numbers

        System.out.println("Repeated Numbers are ");

        for (int i = 0; i < Ids.length; i++) {
            //i retrives every elements in array
            for (int j = i + 1; j < Ids.length; j++) {
                //j only compares elements on its right
                //j starts on i+1, comparing 'i'th element moving forward only
                if (Ids[i] == Ids[j]) {
                    System.out.println(Ids[i]);
                }
            }


        }


    }

    }
