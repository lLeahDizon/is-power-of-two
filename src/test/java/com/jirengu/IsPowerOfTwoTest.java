package com.jirengu;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsPowerOfTwoTest {

    @Test
    public void testIsPowerOfTwo() {
        assertTrue(IsPowerOfTwo.isPowerOfTwo(2));
        assertFalse(IsPowerOfTwo.isPowerOfTwo(3));
        assertTrue(IsPowerOfTwo.isPowerOfTwo(64));
        assertFalse(IsPowerOfTwo.isPowerOfTwo(100));
    }


}
