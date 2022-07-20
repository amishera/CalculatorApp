/**
 * @author KFY4VGJ
 */
public class CalculatorService {
    public static final int ERROR_CODE = 9999;

    public float getResult(int a, int b, String operator) {
        float result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = (float) a / b;
                break;
            default:
                result = ERROR_CODE;
        }

        System.out.println("[Calculator.main] result is: "+result);
        return result;
    }
}
