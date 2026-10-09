package com.example.damnbignumbers;
import org.junit.Assert;
import org.junit.Test;

public class DamnBigNumberTest {
    @Test public void testIncrement() {}
    @Test public void testDecrement() {}

    @Test public void testAdd() {
        DamnBigNumber a = new DamnBigNumber(5);
        DamnBigNumber b = new DamnBigNumber(6);
        DamnBigNumber c = DamnBigNumbers.add(a, b);
        Assert.assertEquals(11L, c.getLong());
    }

    @Test public void testSubtract() {}
    @Test public void testMultiply() {}
    @Test public void testDivide() {}
    @Test public void testEquals() {}
    @Test public void testPrime() {}
}
