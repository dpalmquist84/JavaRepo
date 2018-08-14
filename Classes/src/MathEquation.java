public class MathEquation {

    public double leftVals;
    public double rightVals;
    public char opCodes;
    public double results;

    public void execute() {

        switch (opCodes[i]) {
            case 'a':
                results[i] = leftVals[i] + rightVals[i];
                break;
            case 'd':
                results[i] = rightVals[i] != 0.0 ? leftVals[i] / rightVals[i] : 0.0;
                break;
            case 's':
                results[i] = leftVals[i] - rightVals[i];
                break;
            case 'm':
                results[i] = leftVals[i] * rightVals[i];
                break;
        }
    }
}
