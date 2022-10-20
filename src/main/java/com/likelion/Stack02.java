package com.likelion;

import java.util.EmptyStackException;

public class Stack02 {
    private Integer[] arr;
    private int top = 0;
    //constructor
    public Stack02(){
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    //Arr Getter
    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        this.arr[this.top++] = value;
    }

    public Integer pop(){
        if(isEmpty()){
            //throw new RuntimeException("스택이 비어있습니다");
            throw new EmptyStackException();
        }
        return this.arr[--this.top];
    }

    public boolean isEmpty(){
        return this.top==0;
    }

    public Integer peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return this.arr[this.top - 1];
    }

}
