public class Main {

    public static void main(String[] args) {
	// write your code here\\

        double val1 = 10.00;
        double val2 = 19.15;
        double result;
        char opCode = 'a';

        System.out.println("Enter two numbers and an operator");




        if(opCode == 'a') {
            result = val1 + val2;
        } else if (opCode == 's'){
            result = val1 - val2;
        } else if (opCode == 'm') {
            result = val1 * val2;
        } else if (opCode == 'd') {
            result = val1 / val2;
        } else {
            result = 0;
        }
        System.out.print(result);
    }
}
