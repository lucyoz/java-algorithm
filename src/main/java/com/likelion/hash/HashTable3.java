package com.likelion.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTable3 {
    class Node{
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }
    int size = 10000;
    List<Map<String,Integer>>[] table = new ArrayList[1000];

    public HashTable3() {
    }

    public HashTable3(int size) {
        this.size = size;
        this.table = new ArrayList[size];
    }

    public int hash(String key){
        int asciiNum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiNum += key.charAt(i);
        }
        return asciiNum%1000;
    }

    public void insert(String key, Integer value){
        int hashIdx = hash(key);
        if (this.table[hashIdx]==null){
            this.table[hashIdx] = new ArrayList<>();
        }
        HashMap<String, Integer> hm = new HashMap();
        hm.put(key, value);
        this.table[hashIdx].add(hm);
        System.out.println(key+" "+hashIdx+"방에 저장되었습니다");
    }

//    public Integer search(String key){
//        List<Map<String,Integer>> nodes = this.table[hash(key)];
//        for(Map node:nodes){
//            //key가 일치하는지 확인
//            if(key.equals()){
//                return ;
//            }
//        }
//
//        return null;\....
//    }

//    public static void main(String[] args) {
//        HashTable3 ht = new HashTable3();
//        ht.insert("Yoonseo",1);
//        ht.insert("Seoyoon",2);
//
//        if(ht.search("Yoonseo")==1 &&ht.search("Seoyoon")==2){
//            System.out.println("테스트성공");
//        } else {
//            System.out.println("테스트 실패");
//        }
//    }
}
