public class Question3 {
    public static void main(String[] args){
        int a=2;
        int b=3;
        System.out.println("Before swapping  a=" + a +" , "+"b="+ b);
        doSwap(a,b);
    }
    public static void doSwap(int firstnumber,int secondnumber){
        int temporary;
        temporary=firstnumber;
        firstnumber=secondnumber;
        secondnumber=temporary;
        System.out.println ("After swapping  a=" + firstnumber +" , "+"b="+ secondnumber);


    }
}
