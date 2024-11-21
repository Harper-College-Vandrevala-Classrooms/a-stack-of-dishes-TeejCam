package com.csc;
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
        assertEquals(1, stack.getSize());
    }

    @Test 
    public void testPeek() {
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);

        assertEquals(redDish, stack.peek());
        
    }

    @Test 
    public void testSizePushingAndPopping() {
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);

        stack.pop();

        assertEquals(2, stack.getSize());
    }

}