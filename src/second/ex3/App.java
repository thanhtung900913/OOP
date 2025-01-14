package second.ex3;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        /*
        Yêu cầu:

        - Hoàn thiện code chương trình theo mẫu đã cho.

        - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [15 - 30], gọi là n.
        - Sinh ra n số nguyên ngẫu nhiên, cho vào stack.
            + In ra các phần tử trong stack.
            + Lần lượt xóa các phần tử trong stack. Sau mỗi lần xóa, in ra các phần tử còn lại trong stack.

        - Sinh ra n số nguyên ngẫu nhiên, cho vào queue.
            + In ra các phần tử trong queue.
            + Lần lượt xóa các phần tử trong queue. Sau mỗi lần xóa, in ra các phần tử còn lại trong queue.
        */
        testStack();
        testQueue();

    }

    public static void testStack() {
        /* TODO */
        Random ram = new Random();
        int size = ram.nextInt(30)+15;
        MyStack s = new MyStack();
        for (int i = 0; i < size; i++) {
            int n = ram.nextInt();
            s.push(n);
        }
        System.out.println("Original data: ");
        System.out.println(s);
        for (int i = 0; i < size; i++) {
            s.pop();
            System.out.println("remove "+(i+1)+" times: ");
            System.out.println(s);
        }
    }

    public static void testQueue() {
        /* TODO */
        Random ram = new Random();
        int size = ram.nextInt(30) + 15;
        MyQueue q = new MyQueue();
        for (int i = 0; i < size; i++) {
            int n = ram.nextInt();
            q.add(n);
        }
        System.out.println(q);
        for (int i = 0; i < size; i++) {
            q.remove();
            System.out.println(q);
        }
    }
}
