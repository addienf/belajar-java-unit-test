package programmer.zaman.now.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

@Execution(ExecutionMode.CONCURRENT)
public class SlowTest {

    @Test
    @Timeout(value = 7, unit = TimeUnit.SECONDS)
    void slowTest() throws InterruptedException{
        Thread.sleep(6_000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void slowTest2() throws InterruptedException{
        Thread.sleep(4_000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void slowTest3() throws InterruptedException{
        Thread.sleep(1_000);
    }
}
