package com.example;

//P143Q1
public class InStackGeneric<E> {
    E[] stack;
    int ptr;
    int capacity = 0;

    public InStackGeneric(int stackLength) {
        capacity = stackLength;
        ptr = 0;
        stack = (E[]) new Object[capacity];
    }

    public E push(E x) throws OverflowStackException {
        if (ptr >= capacity) {
            throw new OverflowStackException();
        }
        return stack[ptr++] = x;
    }

    public E pop() throws EmptyStackException {
        if (ptr <= 0) {
            throw new EmptyStackException();
        }

        return stack[--ptr];
    }

    public E peek() throws EmptyStackException {
        if (ptr <= 0) {
            throw new EmptyStackException();
        }

        return stack[ptr - 1];
    }

    public void clear() {
        ptr = 0;
    }

    public int indexOf(E x) {
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

class EmptyStackException extends RuntimeException {
    public EmptyStackException() {

    }
}

class OverflowStackException extends RuntimeException {
    public OverflowStackException() {

    }
}
