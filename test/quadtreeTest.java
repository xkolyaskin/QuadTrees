import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class quadtreeTest {

    protected void checkAgainstCorrect(quadtree trueAnswer, quadtree answer, String testName) {
        String failiurePrefix = "Test case \"" + testName + "\":: ";
    }

    /**
     * Sanity check. Failing this should fail (most) all other tests cases.
     */
    @Test
    void sanityCheck() {
        int x = 500;
        int y = 500;

        quadtree qt = new quadtree(500, 500);
        assertEquals(x, quadtree.bounds.xmax);
        // todo finish implementing test cases
    }


    /**
     * Tests for errors being thrown when they should be.
     */
    /*class ErrorTests {


    }
    @Test
    void inBoundary() {

    }

    @Test
    void subdivide() {

    }

    @Test
    void insert() {

    }*/
}