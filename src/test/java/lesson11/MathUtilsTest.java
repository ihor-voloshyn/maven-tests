package lesson11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        Assert.assertEquals(MathUtils.add(5, 3), 8, "Addition test failed");
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(MathUtils.subtract(5, 3), 2, "Subtraction test failed");
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(MathUtils.multiply(5, 3), 15, "Multiplication test failed");
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(MathUtils.divide(6, 3), 2.0, "Division test failed");
    }

    @Test
    public void testDivideByZero() {
        Assert.assertTrue(Double.isInfinite(MathUtils.divide(5, 0)), "Expected result to be Infinity");
    }
/*
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        MathUtils.divide(5, 0);
    }
*/
}
