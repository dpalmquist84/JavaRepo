import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner (System.in);


    public static void main(String[] args) {
	// write your code here\\

       //calculator app

        //take two numbers
        //take an operator
        //print the result

        double x;
        double y;
        double result = 0;
        String operator;


        System.out.println("To start the program enter two numbers and an operation");

        System.out.print("Enter a value: ");
            x = scanner.nextDouble();
        System.out.print("Enter another value: ");
            y = scanner.nextDouble();
        System.out.print("Enter an operator: ");
            operator = scanner.next();


         switch (operator) {
             case ("add"): {
                 result = x + y;
                 System.out.println(x + " " + operator + " " + y + " : is " + result);
                 break;
             }
             case ("+"): {
                 result = x + y;
                 System.out.println(x + " " + operator + " " + y + " : is " + result);
                 break;
             }
             case ("subtract"): {
                 result = x - y;
                 System.out.println(x + " " + operator + " " + y + " : is " + result);
                 break;
             }
             case ("-"): {
                 result = x - y;
                 System.out.println(x + " " + operator + " " + y + " : is " + result);
                 break;
             }
             case ("multiply"): {
                 result = x * y;
                 System.out.println(x + " " + operator + " " + y + " : is " + result);
                 break;
             }
             case ("*"): {
                 result = x * y;
                 System.out.println(x + " " + operator + " " + y + " : is " + result);
                 break;
             }

             case ("divide"): {
                 if (y == 0) {
                     System.out.println("You cannot divide a number by 0");
                     break;
                 }
                 result = x / y;
                 System.out.println(x + " " + operator + " " + y + " : is " + result);
                 break;
             }

             case ("/"): {
                 if (y == 0) {
                     System.out.println("You cannot divide a number by 0");
                     break;
                 }
                 result = x / y;
                 System.out.println(x + " " + operator + " " + y + " : is " + result);
                 break;
             }


             default:
                 System.out.println("We didn't recognize that operator");
                 break;
         }


















    }
}
