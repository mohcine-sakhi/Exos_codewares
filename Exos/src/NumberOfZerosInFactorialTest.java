import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfZerosInFactorialTest {

    @Test
    void zeros() {
        assertEquals(0, NumberOfZerosInFactorial.zeros(0));
        assertEquals(1, NumberOfZerosInFactorial.zeros(6));
        assertEquals(2, NumberOfZerosInFactorial.zeros(12));
        assertEquals(7, NumberOfZerosInFactorial.zeros(30));
        assertEquals(13, NumberOfZerosInFactorial.zeros(55));
        assertEquals(18, NumberOfZerosInFactorial.zeros(75));
        assertEquals(24, NumberOfZerosInFactorial.zeros(100));
        assertEquals(24999, NumberOfZerosInFactorial.zeros(100000));
        assertEquals(249999998, NumberOfZerosInFactorial.zeros(1000000000));


    }
}