package testing;

import com.example.calcolatorebinario.BinaryCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinaryCalculator {

    @Test
    void testBinarySum(){
        String actual = BinaryCalculator.binarySum("10", "11");
        String expected = "101";

        assertEquals(expected, actual);
    }

}
