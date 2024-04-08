package com.example;

//P143Q1
public class InStack {
    int[] stack;
    int ptr;
    int capacity = 0;

    public InStack(int stackLength) {
        capacity = stackLength;
        ptr = 0;
        stack = new int[capacity];
    }

    public class EmptyStackException extends RuntimeException {
        public EmptyStackException() {

        }
    }

    public class OverflowStackException extends RuntimeException {
        public OverflowStackException() {

        }
    }

    public int push(int x) throws OverflowStackException {
        if (ptr >= capacity) {
            throw new OverflowStackException();
        }
        return stack[ptr++] = x;
    }

    public int pop() throws EmptyStackException {
        if (ptr <= 0) {
            throw new EmptyStackException();
        }

        return stack[--ptr];
    }

    public int peek() throws EmptyStackException {
        if (ptr <= 0) {
            throw new EmptyStackException();
        }

        return stack[ptr - 1];
    }

    public void clear() {
        ptr = 0;
    }

    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--) {
            if (stack[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {

        return ptr <= 0;
    }

    public boolean isFull() {

        return ptr >= capacity;
    }

    public void dump() throws EmptyStackException {
        if (ptr <= 0) {
            new EmptyStackException();
        } else {

            for (int i = 0; i < ptr; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}
