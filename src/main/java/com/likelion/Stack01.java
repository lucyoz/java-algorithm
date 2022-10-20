package com.likelion;

import java.util.ArrayList;
import java.util.List;

public class Stack01 {

    private int[] arr = new int[10000];
    private int pointer = 0;
    private List<Integer> arl = new ArrayList<>();


    public Stack01() {  }
    public Stack01(int size){
        this.arr = new int[size];
    }

    public void push(int value){
        this.arr[this.pointer] = value;
        this.pointer++;
    }

    public int pop(){
        //push 10[0] push 20[1] point 2
        int value = this.arr[this.pointer-1];
        this.pointer--;
        return value;
    }

    public int[] getArr(){
        return arr;
    }
}
