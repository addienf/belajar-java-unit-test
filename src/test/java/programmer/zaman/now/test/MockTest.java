package programmer.zaman.now.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {
    @Test
    void testMock() {
        List<String> list = Mockito.mock(List.class);

        Mockito.when(list.get(0)).thenReturn("Addien");

        Assertions.assertEquals("Addien", list.get(0));

        Mockito.verify(list, Mockito.times(1)).get(0);
    }
}
