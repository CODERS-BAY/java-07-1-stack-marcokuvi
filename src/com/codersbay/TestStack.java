package com.codersbay;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class TestStack {

    @Test
    public void testAddingNewInteger() {
        Stack stack = new Stack();
        stack.push(4);
        assertEquals(4, stack.getStackList().get(0));
    }

    @Test
    public void testIfStackIsFilled() {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(4);
        stack.push(54);
        assertEquals(3, stack.size());
    }

    @Test
    public void testRemovingTheLastInteger() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.pop();
        assertEquals(2, stack.size());
    }

    @Test
    public void testShowingLastIntegerWithoutRemoving() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.peek();
        assertEquals(7, stack.peek());
    }

    @Test
    public void testRemovingAStackWithMoreIntegers() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        int[] ints = {7, 6};
        assertArrayEquals(ints, stack.pop(2));
    }

    @Test
    public void testIfEmptyStackExceptionIsThrownWhenStackListIsEmpty() {
        assertThrows(EmptyStackException.class, () -> {
            Stack stack = new Stack();
            stack.getStackList();
            stack.pop();
        });
    }
}
