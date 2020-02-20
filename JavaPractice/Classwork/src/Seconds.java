import java.util.Scanner;

public class Seconds {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Please Enter Seconds= ");

        int seconds= in.nextInt();

        int p1= seconds % 60;
        int p2= seconds/60;
        int p3 = p2 % 60;

        p2= p2 / 60;

        System.out.println("Hour= " +p3);
        System.out.println("Minute= "+p2 );
        System.out.println("Seconds= "+p1);
    }
}
