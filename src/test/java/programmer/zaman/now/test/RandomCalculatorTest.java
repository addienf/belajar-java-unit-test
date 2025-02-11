package programmer.zaman.now.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.Random;


public class RandomCalculatorTest extends AbstractCalculatorTest {

    public static List<Integer> parameterSource(){
        return List.of(1, 2, 3, 4, 5);
    }

    @ParameterizedTest
    @MethodSource({"parameterSource"})
    void testWithMethodSource(Integer val){
        var expected = val + val;
        var actual = calculator.add(val, val);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Test Calculator with Parameter")
    @ParameterizedTest(name = "{displayName} with data {0}")
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testWithParameter(int val){
        var result = val + val;
        Assertions.assertEquals(result, calculator.add(val, val));
    }

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
