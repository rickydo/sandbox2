import org.junit.Test;

import static groovy.util.GroovyTestCase.assertEquals;

public class SumTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void sum() {
    }

    public void testSum() {
        assertEquals(5, Sum.sum(2,3));
    }

}