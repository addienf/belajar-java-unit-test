package programmer.zaman.now.test;

import org.junit.jupiter.api.*;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    private int count = 0;

    @BeforeAll
    void beforeAll() {

    }

    @AfterAll
    void afterAll() {

    }

    @Test
    @Order(3)
    void test3(){
        count++;
        System.out.println(count);
    }

    @Test
    @Order(1)
    void test1(){
        count++;
        System.out.println(count);
    }

    @Test
    @Order(2)
    void test2(){
        count++;
        System.out.println(count);
    }
}
