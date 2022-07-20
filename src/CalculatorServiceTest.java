import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author KFY4VGJ
 */
public class CalculatorServiceTest {
    private CalculatorService testObj = new CalculatorService();

    // when input is this then output is that
    @Test
    public void testMain_when_operator_is_plus_then_return_sum() {
        // we would like to test for "+"
        // args[0] = "+"
        // args[1] = "3"
        // args[2] = "5"
        // expected result: 8

        //String[] args = {"+", "3", "5", ""};
        float result = testObj.getResult(3, 5, "+");

       // String result = args[3];
        assertEquals(8, result, 0.001);
      //  assertTrue(result.contains("8"));
    }

    @Test
    public void testMain_when_operator_is_minus_then_return_subtraction() {
        // we would like to test for "-"
        // args[0] = "-"
        // args[1] = "3"
        // args[2] = "5"
        // expected result: -2

        String[] args = {"-", "3", "5", ""};
        float result = testObj.getResult(3, 5, "-");

        assertEquals(-2, result, 0.001);
    }

    @Test
    public void testMain_when_operator_is_multiplication_then_return_product() {
        // we would like to test for "-"
        // args[0] = "-"
        // args[1] = "3"
        // args[2] = "5"
        // expected result: -2

        //String[] args = {"*", "3", "5", ""};
        float result = testObj.getResult(3, 5, "*");

        assertEquals(15, result, 0.001);
    }

    @Test
    public void testMain_when_operator_is_division_then_return_division_result() {
        // we would like to test for "-"
        // args[0] = "-"
        // args[1] = "3"
        // args[2] = "5"
        // expected result: -2

       // String[] args = {"/", "3", "5", ""};
       // Calculator.main(args);
        float result = testObj.getResult(3, 5, "/");

        assertEquals(0.6, result, 0.001);

    }

    @Test
    public void testMain_when_operator_is_ampersand_then_return_error_code() {
        // we would like to test for "-"
        // args[0] = "-"
        // args[1] = "3"
        // args[2] = "5"
        // expected result: -2

     //   String[] args = {"&", "3", "5", ""};
      //  Calculator.main(args);

        float result = testObj.getResult(3, 5, "&");

        assertEquals(CalculatorService.ERROR_CODE, result, 0.001);
    }

    // SOLID principle
}