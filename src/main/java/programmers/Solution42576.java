package programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution42576 {
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

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        for (int i = 0; i < completion.length; i++) {
            insert(completion[i], 1);
        }
        for(String par:participant){
            Integer intPar = search(par);
            if (intPar == null){
                answer = par;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"}

        Solution42576 solution42576 = new Solution42576();
    }
}
