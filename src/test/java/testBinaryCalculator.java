import com.example.calcolatorebinario.BinaryCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBinaryCalculator {

    @Test
    void testBinarySum(){
        String actual = BinaryCalculator.binarySum("110", "101");
        String expected = "1011";

        assertEquals(expected, actual);
    }

}
