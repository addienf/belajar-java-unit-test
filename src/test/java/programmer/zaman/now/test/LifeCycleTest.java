package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;

public class LifeCycleTest {

    private String temp;

    @Test
    void testA(){
        temp ="Addien";
    }

    @Test
    void testB(){
        System.out.println(temp);
    }
}
