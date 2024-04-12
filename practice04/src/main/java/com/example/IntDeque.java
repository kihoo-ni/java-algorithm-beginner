package com.example;

public class IntDeque {

    // --- 실행 시 예외 : 큐가 비어 있음 ---//
    public class EmptyIntDequeException extends RuntimeException {
        public EmptyIntDequeException() {
        }
    }

    // --- 실행 시 예외 : 큐가 가득 참 ---//
    public class OverflowIntDequeException extends RuntimeException {
        public OverflowIntDequeException() {
        }
    }

    private int[] que; // 덱의 본체
    private int capacity; // 덱의 용량
    private int num; // 현재 데이터 개수
    private int front; // 맨앞 요소 커서
    private int rear; // 맨끝 요소 커서

    // --- 생성자 ---//
    public IntDeque(int maxlen) {

    }

    // --- 덱의 맨앞에 데이터를 인큐 ---//
    public int enqueFront(int x) throws OverflowIntDequeException {

    }

    // --- 덱의 맨끝에 데이터를 인큐 ---//
    public int enqueRear(int x) throws OverflowIntDequeException {

    }

    // --- 덱의 맨앞 데이터를 디큐 ---//
    public int dequeFront() throws EmptyIntDequeException {

    }

    // --- 덱의 맨끝 데이터를 디큐 ---//
    public int dequeRear() throws EmptyIntDequeException {

    }

    // --- 덱의 맨앞 데이터를 피크(맨앞 데이터를 들여다봄 ) ---*/
    public int peekFront() throws EmptyIntDequeException {

    }

    // --- 덱의 맨끝에서 데이터를 피크(맨끝 데이터를 들여다봄 ) ---*/
    public int peekRear() throws EmptyIntDequeException {

    }

    // --- 덱에서 x를 검색하여 인덱스(발견하지 못하면 -1)를 반환합니다 ---//
    public int indexOf(int x) {

    }

    // --- 덱에서 x를 검색하여 맨앞에서 몇 번째인가(발견하지 못하면 0)를 반환합니다 ---//
    public int search(int x) {

    }

    // --- 덱을 비웁니다 ---//
    public void clear() {

    }

    // --- 덱의 용량을 반환합니다 ---//
    public int getCapacity() {

    }

    // --- 덱에 쌓여있는 데이터수를 반환합니다 ---//
    public int size() {

    }

    // --- 덱이 비어 있는가? ---//
    public boolean isEmpty() {

    }

    // --- 덱이 가득 찼는가? ---//
    public boolean isFull() {

    }

    // --- 덱 안의 모든 데이터를 맨앞 → 맨끝의 순서로 출력 ---//
    public void dump() {

    }
}
