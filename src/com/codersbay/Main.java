package com.codersbay;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(22);
        stack.push(2);
        stack.push(5);
        stack.push(14);
        stack.push(13);
        stack.pop(6);
        stack.size();
        stack.peek();

        System.out.println();

        Stack stack1 = new Stack();
        stack1.push(5);
        stack1.push(9);
        stack1.push(15);
        stack1.push(26);
        stack1.push(4);
        stack1.push(6);
        stack1.push(45);
        stack1.pop();
        stack1.size();
        stack1.push(55);
        stack1.push(17);
        stack1.peek();
        stack1.pop(4);
        stack1.size();

        Stack stack2 = new Stack();
        stack2.pop();

    }
}
