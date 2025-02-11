package programmer.zaman.now.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

public class ConditionTest {

    @Test
    public void testSystemProperties(){
        Properties properties = System.getProperties();
        properties.forEach((key, val) -> System.out.println(key + ": " + val));
    }

    @Test
    @EnabledOnOs(value = {OS.WINDOWS})
    public void onlyRunWindows(){}

    @Test
    @DisabledOnOs(value = {OS.WINDOWS})
    public void disabledRunOnWindows(){}

    @Test
    @EnabledOnJre(value = {JRE.JAVA_14})
    public void onlyRunOnJava14(){}

    @Test
    @DisabledOnJre(value = {JRE.JAVA_14})
    public void disabledRunOnJava14(){}

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_14)
    public void onlyRunOnJava11ToJava14(){}

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_14)
    public void disabledRunOnJava11ToJava14(){}

    @Test
    @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    public void enableOnOracle(){}

    @Test
    @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    public void disabledOnOracle(){}

    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    public void enableOnPrifileDev(){}

    @Test
    @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    public void disabledOnPrifileDev(){}

}
