package ru.foxit.grayfox.PriorityQueue;

public class PriorityApp {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue(5);

        q.insert(11);
        q.insert(22);
        q.insert(33);
        q.insert(44);
        q.insert(55);
        while (!q.isEmpty()){
            int item = q.remove();
            System.out.println(item + "");
        }
        System.out.println();
    }
}
