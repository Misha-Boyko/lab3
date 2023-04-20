import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testPrepend(){
        LinkedList testLink = new LinkedList();
        for (int i = 0; i < 4; i++) {
            testLink.prepend(i); // 3 -> 2 -> 1 -> 0
        }
        assertEquals( testLink.toString(), "3 2 1 0 ");
    }

    @Test
    public void testAppend(){
        LinkedList testLink = new LinkedList();
        for (int i = 0; i < 4; i++) {
            testLink.append(i); // 0 -> 1 -> 2 -> 3
        }
        assertEquals( "0 1 2 3 ",  testLink.toString());
    }

}
