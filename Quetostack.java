package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Quetostack {
    public static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;

        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}

import java.util.*;

class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {}

    public void push(int x) {
        if(q1.isEmpty()){
            q1.add(x);
        }
        else{
            q2.add(x);
        }
    }

    public int pop() {
        if(empty()){
            return -1;
        }

        int ele = -1;

        if(!q1.isEmpty()){
            while(q1.size() > 1){
                q2.add(q1.remove());
            }
            ele = q1.remove();   // last element (top)
        }
        else{
            while(q2.size() > 1){
                q1.add(q2.remove());
            }
            ele = q2.remove();   // last element (top)
        }

        return ele;
    }

    public int top() {
        if(empty()){
            return -1;
        }

        int ele = -1;

        if(!q1.isEmpty()){
            while(q1.size() > 1){
                q2.add(q1.remove());
            }
            ele = q1.remove();   // get last element
            q2.add(ele);         // put it back
        }
        else{
            while(q2.size() > 1){
                q1.add(q2.remove());
            }
            ele = q2.remove();
            q1.add(ele);
        }

        return ele;
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

import java.util.*;

class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {}

    public void push(int x) {
        // Always push into q2
        q2.add(x);

        // Move all elements from q1 to q2
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        if(!q1.isEmpty()){
            q1.add(x);
        }
        else{
            q2.add(x);
        }
    }

    public int pop() {
        if(empty()){
            return -1;
        }
        int ele=-1;
        if(!q1.isEmpty()){
            while(q1.size()>1){
                q2.add(q1.remove());
            }
                ele = q1.remove();
            }
        else{
            while(q2.size()>1){
                q1.add(q2.remove());
            }
            ele = q2.remove();
        }
        return ele;
    }


    public int top() {
        if(empty()){
            return -1;
        }
        int ele=-1;
        if(!q1.isEmpty()){
            while(q1.size()>1){
                q2.add(q1.remove());
            }
                ele = q1.remove();
                q2.add(ele);
            }
        else{
            while(q2.size()>1){
                q1.add(q2.remove());
            }
            ele = q2.remove();
            q1.add(ele);
        }
        return ele;
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
