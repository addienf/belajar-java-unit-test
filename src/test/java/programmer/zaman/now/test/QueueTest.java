package programmer.zaman.now.test;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A Queue")
public class QueueTest {

    private Queue<String> queue;

    @Nested
    @DisplayName("When New")
    public class WhenNew{

        @BeforeEach
        void setUp() {
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("When Offer, Size Must Be 1")
        void offerNewData(){
            queue.offer("Addien");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName("When Offer, Size Must Be 2")
        void offerMoreData(){
            queue.offer("Addien");
            queue.offer("Fauzan");
            Assertions.assertEquals(2, queue.size());
        }
    }
}
