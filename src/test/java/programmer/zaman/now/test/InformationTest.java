package programmer.zaman.now.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("Test with TestInfo")
public class InformationTest {

    @Test
    @Tag("cool")
    @DisplayName("This is test one")
    void testOne(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getTestClass());
    }
}
