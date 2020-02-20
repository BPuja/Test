import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        int length;
        int breadth;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length");
        length=input.nextInt();
        System.out.println("Enter breadth");
        breadth=input.nextInt();

        int Area=length*breadth;
        int Perimeter=2*(length+breadth);
        System.out.println("The Area is "+Area);
        System.out.println("The Perimeter is "+Perimeter);

    }
}
