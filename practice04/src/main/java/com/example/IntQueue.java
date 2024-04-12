package com.example;

public class IntQueue {
	private int[] que; // 큐용 배열
	private int capacity; // 큐의 용량
	private int front; // 맨앞 요소 커서
	private int rear; // 맨끝 요소 커서
	private int num; // 현재 데이터 개수

	// --- 실행 시 예외 : 큐가 비어 있음 ---//
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// --- 실행 시 예외 : 큐가 가득 참 ---//
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	// --- 생성자 ---//
	public IntQueue(int maxlen) {
		capacity = maxlen;
		front = rear = num = 0;
		que = new int[capacity];
	}

	// --- 큐에 데이터를 인큐 ---//
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= capacity) {
			throw new OverflowIntQueueException();
		}
		que[rear++] = x;
		num++;
		if (rear == capacity) {
			rear = 0;
		}

		return x;
	}

	// --- 큐에서 데이터를 디큐 ---//
	public int deque() throws EmptyIntQueueException {
		if (num <= 0) {
			throw new EmptyIntQueueException();
		}
		int x = que[front++];
		num--;
		if (front == capacity) {
			front = 0;
		}
		return x;
	}

	// --- 큐에서 데이터를 피크(맨앞 데이터를 들여다봄 ) ---//
	public int peek() throws EmptyIntQueueException {
		if (num <= 0) {
			throw new EmptyIntQueueException();
		}
		return que[front];
	}

	// --- 큐를 비웁니다 ---//
	public void clear() {
		rear = front = num = 0;
	}

	// --- 큐에서 x를 검색하여 인덱스(발견하지 못하면 -1)를 반환합니다 ---//
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if (que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}

	// --- 큐에서 x를 검색하여 맨앞에서 몇 번째인가(발견하지 못하면 0)를 반환합니다 ---//
	public int search(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if (que[idx] == x) {
				return i + 1;
			}
		}
		return -1;
	}

	// --- 큐의 용량을 반환합니다 ---//
	public int getCapacity() {
		return capacity;

	}

	// --- 큐에 쌓여있는 데이터수를 반환합니다 ---//
	public int size() {
		return num;
	}

	// --- 큐가 비어 있는가? ---//
	public boolean isEmpty() {
		return num <= 0;
	}

	// --- 큐가 가득 찼는가? ---//
	public boolean isFull() {
		return num >= capacity;
	}

	// --- 큐 안의 모든 데이터를 맨앞 → 맨끝의 순서로 출력 ---//
	public void dump() {
		for (int i = 0; i < num; i++) {
			System.out.print(que[(i + front) % capacity] + " ");
		}
		System.out.println();
	}
}
