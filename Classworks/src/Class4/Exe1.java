package Class4;

public class Exe1 {
    public static void main(String[] args){

        String strs1="Test";
        String strs2="Test";


        String strs3=new String("Test" );
        String strs4=new String("Test");


        System.out.println (strs1==strs2);
        //variable from same objects which is why it is true.
        //same memory location
         System.out.println(strs2==strs3);
        System.out.println(strs1==strs4);
        // different objects has different memory location so it cannot be equal

    }
}
