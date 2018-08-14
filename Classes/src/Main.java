public class Main {

    public static void main(String[] args) {
	// write your code here

//        double[] leftVals = { 100.0, 25.0, 225.0 11.0};
//        double[] rightVals = { 50.0, 92.0, 17.0, 3.0};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0, 50.0, 'd');
        equations[1] = create(25.9 , 92.0, 'a');
        equations[2] = create(225.25, 65.4, 'd');
        equations[3] = create(13.2, 14.5, 'd');


        for (MathEquation equation: equations) {
            equation.execute();
            System.out.print("results = ");
            System.out.println(equation.result);
        }
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;

        return equation;

    }
}
