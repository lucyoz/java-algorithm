package com.likelion.hash;

public class HashFunction {
    public int hash(String key){
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            int ascii = key.charAt(i);
            asciiSum += ascii;
        }
        System.out.println("asciiSum: "+asciiSum);
        return asciiSum%90;
    }

    public static void main(String[] args) {
        HashFunction hf = new HashFunction();
        hf.hash("keyongrok");
    }

}
