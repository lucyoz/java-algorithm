package com.likelion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    @BeforeEach     //각 테스트가 실행되기 전에 실행되는 구간
    void setUp() {
        // ex) DB에서 데이터 지우는 코드
        // ex> DB에 데이터를 넣는 코드
        System.out.println("before each");

    }
    @Test
    @DisplayName("push가 잘되는지")
    void push(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    void pushAndPop(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
    }

}