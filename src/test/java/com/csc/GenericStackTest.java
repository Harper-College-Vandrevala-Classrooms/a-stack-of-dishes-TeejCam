package com.csc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GenericStackTest
{
    GenericStack<Integer> iStack;
    GenericStack<String> sStack;

    @BeforeEach 
    void setUp() {
        iStack = new GenericStack<>();
        sStack = new GenericStack<>();
    }

    @Test 
    public void testIntegerPush() {
        iStack.push(1);
        assertEquals(1, iStack.getSize());
    }

    @Test 
    public void testIntegerPeek() {
        iStack.push(2);
        iStack.push(3);
        iStack.push(4);

        assertEquals(4, iStack.peek());
    }

    @Test 
    public void testStringPushAndPop() {
        sStack.push("red");
        sStack.push("green");

        sStack.pop();

        assertEquals(1, sStack.getSize());
    }
}