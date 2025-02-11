package programmer.zaman.now.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.util.Random;


public class RandomCalculatorTest extends AbstractCalculatorTest {

    @DisplayName("Test Calculator Random")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
//    @Test
    void testRandom(Random random){
        var a = random.nextInt();
        var b = random.nextInt();

        Assertions.assertEquals(a + b, calculator.add(a, b));
    }
}
