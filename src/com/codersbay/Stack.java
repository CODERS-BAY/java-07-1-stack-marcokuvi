package com.codersbay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {

    private List<Integer> stackList = new ArrayList<>();

    public List<Integer> getStackList() {
        return stackList;
    }

    public void push(int newElement) {
        stackList.add(newElement);
    }

    public int size() {
        int size = stackList.size();
        System.out.println(stackList.toString());
        System.out.println(size);
        return size;
    }

    public int pop() {
        if (stackList.isEmpty()) {
            throw new EmptyStackException();
        } else {
            int last = stackList.remove(stackList.size() - 1);
            return last;
        }
    }

    public int peek() {
        if (stackList.isEmpty()) {
            throw new EmptyStackException();
        } else {
            int last = stackList.get(stackList.size() - 1);
            System.out.println(last);
            return last;
        }
    }

    public int[] pop(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        if (stackList.isEmpty()) {
            throw new EmptyStackException();
        } else {
            int i = 0;
            while (i < n) {
                stackList.get(stackList.size() - 1);
                numbers.add(stackList.get(stackList.size() - 1));
                stackList.remove(stackList.size() - 1);
                i++;
            }
        }
        int[] lastNumbers = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            lastNumbers[i] = numbers.get(i);
        }
        System.out.println(Arrays.toString(lastNumbers));
        return lastNumbers;
    }
}
