import java.util.*;

public class BasicsQueue {
    static class Stack {
        Deque<Integer> deque = new ArrayDeque<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            if (deque.isEmpty()) {
                System.out.println("Stack is empty, cannot pop.");
                return -1; // or throw an exception
            }
            return deque.removeLast();
        }

        public int peek() {
            if (deque.isEmpty()) {
                System.out.println("Stack is empty, cannot peek.");
                return -1; // or throw an exception
            }
            return deque.getLast();
        }
    }

    static class Queue {
        Deque<Integer> deque = new ArrayDeque<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            if (deque.isEmpty()) {
                System.out.println("Queue is empty, cannot remove.");
                return -1; // or throw an exception
            }
            return deque.removeFirst();
        }

        public int peek() {
            if (deque.isEmpty()) {
                System.out.println("Queue is empty, cannot peek.");
                return -1; // or throw an exception
            }
            return deque.getFirst();
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove()); // This will trigger the empty queue handling
    }
}
