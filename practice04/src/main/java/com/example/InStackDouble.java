package com.example;

//P143Q1
public class InStackDouble {
    int[] stack;
    int ptrA;
    int ptrB;
    int capacity = 0;

    public enum Stacks {
        A, B
    }

    public InStackDouble(int stackLength) {
        capacity = stackLength;
        ptrA = 0;
        ptrB = capacity - 1;
        stack = new int[capacity];
    }

    public int push(Stacks stacks, int x) throws OverflowStackException {
        if (ptrA >= ptrB + 1) {
            throw new OverflowStackException();
        }
        if (stacks == Stacks.A) {
            return stack[ptrA++] = x;
        } else {
            return stack[ptrB--] = x;
        }

    }

    public int pop(Stacks stacks) throws EmptyStackException {
        if (stacks == Stacks.A) {
            if (ptrA <= 0) {
                throw new EmptyStackException();
            }
            return stack[--ptrA];
        } else {
            if (ptrB >= capacity - 1) {
                throw new EmptyStackException();
            }
            return stack[++ptrB];
        }
    }

    public int peek(Stacks stacks) throws EmptyStackException {
        if (stacks == Stacks.A) {
            if (ptrA <= 0) {
                throw new EmptyStackException();
            }
            return stack[ptrA - 1];
        } else {
            if (ptrB >= capacity - 1) {
                throw new EmptyStackException();
            }
            return stack[ptrB + 1];
        }
    }

    public void clear() {
        ptrA = 0;
        ptrB = 0;
    }

    public int indexOf(Stacks stacks, int x) {

        if (stacks == Stacks.A) {
            for (int i = ptrA - 1; i >= 0; i--) {
                if (stack[i] == x) {
                    return i;
                }
            }

        } else {
            for (int i = ptrB + 1; i < capacity; i--) {
                if (stack[i] == x) {
                    return i;
                }
            }

        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size(Stacks stacks) {
        if (stacks == Stacks.A) {

            return ptrA;

        } else {

            return capacity - ptrB - 1;
        }

    }

    public boolean isEmpty(Stacks stacks) {
        if (stacks == Stacks.A) {

            return ptrA <= 0;

        } else {

            return ptrB >= capacity - 1;
        }

    }

    public boolean isFull() {

        return ptrA >= ptrB + 1;
    }

    public void dump(Stacks stacks) throws EmptyStackException {

        if (stacks == Stacks.A) {

            if (ptrA <= 0) {
                throw new EmptyStackException();
            }

            for (int i = 0; i < ptrA; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();

        } else {

            if (ptrB >= capacity - 1) {
                throw new EmptyStackException();
            }

            for (int i = capacity - 1; i > ptrB; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();

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
}
