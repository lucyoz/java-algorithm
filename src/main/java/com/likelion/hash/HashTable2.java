package com.likelion.hash;

import java.util.ArrayList;
import java.util.List;

public class HashTable2 {
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
    List<Node>[] table = new ArrayList[1000];

    public int hash(String key){
        int asciiNum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiNum += key.charAt(i);
        }
        return asciiNum%1000;
    }
    public void insert(String key, Integer value){
        int hashIdx = hash(key);
        if(this.table[hashIdx]==null){
            this.table[hashIdx] = new ArrayList<>();
        }
        //Map, Object
        this.table[hashIdx].add(new Node(key, value));
        System.out.println(key + " "+hashIdx+"방에 저장이 완료되었습니다.");
    }

    public Integer search(String key){
        List<Node> nodes = this.table[hash(key)];
        for (Node node: nodes) {
            if(key.equals(node.getKey())){
                return node.getValue();
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashTable2 ht = new HashTable2();
        ht.insert("Yoonseo",1);
        ht.insert("Seoyoon",2);

        if(ht.search("Yoonseo")==1 &&ht.search("Seoyoon")==2){
            System.out.println("테스트성공");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
