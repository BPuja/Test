import java.util.Scanner;

public class WarmupD {
    public static void main(String[] args) {
        int firstnumber;
        int secondnumber;
        Scanner sum= new Scanner(System.in);
        System.out.println("Enter First Number");
        firstnumber=sum.nextInt();
        System.out.println("Enter Second Number");
        secondnumber=sum.nextInt();

        int totalsum= firstnumber+secondnumber;
        System.out.println("The sum is "+totalsum);



    }

}
