package programmer.zaman.now.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.opentest4j.TestAbortedException;
import programmer.zaman.now.test.generator.SimpleDisplayNameGenerator;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After All");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Before Unit Test");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After Unit Test");
    }

    @Test
    public void testAddSuccess(){
        var result = calculator.add(10, 10);
        assertEquals(20, result);
    }

    @Test
    public void testDevideSuccess(){
        var result = calculator.devide(100, 10);
        assertEquals(10, result);
    }

    @Test
    public void testDevideFailed(){
        assertThrows(IllegalArgumentException.class, () ->{
           calculator.devide(100, 0);
        });
    }

    @Test
    @Disabled
    public void testComingSoon(){

    }

    @Test
    public void testAborted(){
        var profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)){
            throw new TestAbortedException("Test dibatalkan karena bukan DEV");
        }

        //Unit test untuk DEV
    }

    @Test
    public void testAssumption(){
        assumeTrue("DEV".equals(System.getenv("PROFILE")));

        //Dev Unit Test
    }
}
