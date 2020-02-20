package Class2.Arays;

// Define an array 'name' with five names

public class Exercise1 {
    public static void main(String[] args){

        String[] Names= {"Puja","Aashra","Rakshya","Prava","Alisa"};

        System.out.println("The names are: ");

        for (int a=0; a<Names.length; a++){
            System.out.println(Names[a]);
        }

        System.out.println("Total Number of Index=  "+Names.length);
        System.out.println("FirstName= "+Names[0]+", "+"LastName= "+Names[Names.length-1]);

        //Print middlename in Uppercase
        System.out.println("The name in the middle of this array=  "+Names[Names.length/2].toUpperCase());

    }

}
