package programmer.zaman.now.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
        @Tag("integration-test")
})
public class SimpleIntegrationTest {

    @Test
    public void integrationTest1(){
        System.out.println("Integration Test 1");
    }

    @Test
    public void integrationTest2(){
        System.out.println("Integration Test 2");
    }
}
