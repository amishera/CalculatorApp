import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author KFY4VGJ
 */
public class CalculatorInfixTest {
    @Test
    public void test_given_operands_are_3_and_5_when_operator_is_plus_then_return_8() {
        String[] args = {"+", "3", "5"};
        float result = Calculator.process(args);
        assertEquals(8, result, 0.001);
    }

    @Test
    public void test_given_operands_are_3_and_5_when_operator_is_minus_then_return_minus_2() {
        String[] args = {"-", "3", "5"};
        float result = Calculator.process(args);
        assertEquals(-2, result, 0.001);
    }

    @Test
    public void test_given_operands_are_3_and_5_when_operator_is_multiplication_then_return_15() {
        String[] args = {"*", "3", "5"};
        float result = Calculator.process(args);
        assertEquals(15, result, 0.001);
    }

    @Test
    public void test_given_operands_are_3_and_5_when_operator_is_division_then_return_0_6() {
        String[] args = {"/", "3", "5"};
        float result = Calculator.process(args);
        assertEquals(0.6, result, 0.001);
    }

    @Test
    public void test_given_operands_are_3_and_5_when_operator_is_ampersand_then_return_errorCode() {
        String[] args = {"&", "3", "5"};
        int result = (int) Calculator.process(args);
        assertEquals(9999, result);
    }
}
