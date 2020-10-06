package com.codersbay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStack {

    @Test
    public void testAddingNewInteger() {
        Stack stack = new Stack();
        stack.push(4);
        assertEquals(4, stack.stackList.get(0));
    }

    @Test
    public void testIfStackIsEmpty() {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(4);
        stack.push(54);
        assertEquals(3, stack.stackList.size());
    }

    @Test
    public void testRemovingTheLastInteger() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.pop();
        assertEquals(2, stack.stackList.size());
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
        stack.pop(2);
        assertEquals(1, stack.stackList.size());
    }
}
