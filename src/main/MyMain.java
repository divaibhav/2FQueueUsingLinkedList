package main;

import implementation.MyQueue;

import java.util.Random;

public class MyMain {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(200);
        queue.travers();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(random.nextInt(100));
            queue.travers();
        }

        for (int i = 0; i < 7; i++) {
            Integer element = queue.dequeue();
            if (element != null){
                System.out.println("deleted element = " + element);
            }
            else{
                System.out.println("queue underflow");
            }
            queue.travers();
        }
    }
}
