package Class3;

public class Calculator {
   public int num1;
   public int num2;

   public int add(){
       int result=num1+num2;
       return result;
   }
   public int sub(){
       int result=num1-num2;
       return  result;
   }
   public int mul(){
       int result= num1*num2;
       return result;
   }
   public double div() {
       double result = 0.0;
       if (num2 == 0) {
           System.out.println("Cannot divide by 0");
       } else {
           result = (double)num1 / (double) num2;

       }
       return result;

   }
}

