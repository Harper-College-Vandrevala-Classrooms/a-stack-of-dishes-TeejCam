import com.csc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest
{
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test 
    public void testStackSizeForZero() {
        assertEquals(0, stack.getSize());
    }

    @Test 
    public void testStackSizeForOne() {
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        stack.push(oneDish);
        assertEquals(0, stack.getSize());
    }
}