package com.example;

public class IntArrayQueue {
    private int[] que; // 큐 배열
    private int capacity; // 큐 용량
    private int num; // 현재 데이터 갯수
    int dequeCount = 0;

    public class EmptyIntArrayQueueException extends RuntimeException {
        public EmptyIntArrayQueueException() {
        }
    }

    public class OverflowIntArrayQueueException extends RuntimeException {
        public OverflowIntArrayQueueException() {
        }
    }

    public IntArrayQueue(int maxlen) {
        capacity = maxlen;
        num = 0;
        que = new int[capacity];

    }

    public int enque(int x) throws OverflowIntArrayQueueException {
        if (num >= capacity) {
            throw new OverflowIntArrayQueueException();
        } else {
            return que[num++] = x;
        }
    }

    public int deque() throws EmptyIntArrayQueueException {
        if (num <= 0) {
            throw new EmptyIntArrayQueueException();
        } else {
            int queStore = que[0];
            for (int i = 0; i < num - 1; i++) {

                que[i] = que[i + 1];
            }
            num--;
            return queStore;
        }
    }

    public int peek() throws EmptyIntArrayQueueException {
        if (num < 0) {
            throw new EmptyIntArrayQueueException();
        } else {
            return que[num - 1];
        }
    }

    public void clear() {
        num = 0;
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            if (que[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // 큐의 용량 반환
    public int getCapacity() {
        return capacity;
    }

    // 데이터 갯수 반환
    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() throws EmptyIntArrayQueueException {
        if (num <= 0) {
            new EmptyIntArrayQueueException();
        }
        for (int i = 0; i < num; i++) {
            System.out.print(que[i] + " ");
        }
        System.out.println();
    }

}
