import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitCountingTest {

    @Test
    void countBits() {

        assertEquals(5, BitCounting.countBits(1234));
        assertEquals(1, BitCounting.countBits(4));
        assertEquals(3, BitCounting.countBits(7));
        assertEquals(2, BitCounting.countBits(9));
        assertEquals(2, BitCounting.countBits(10));
    }

    @Test
    void binary() {
        assertEquals("10011010010", BitCounting.binary(1234));
        assertEquals("100", BitCounting.binary(4));
        assertEquals("111", BitCounting.binary(7));
        assertEquals("1001", BitCounting.binary(9));
        assertEquals("1010", BitCounting.binary(10));
        assertEquals("1", BitCounting.binary(1));
        assertEquals("0", BitCounting.binary(0));
    }
}