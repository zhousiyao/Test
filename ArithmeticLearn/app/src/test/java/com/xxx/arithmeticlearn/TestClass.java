package com.xxx.arithmeticlearn;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestClass {

    //producer  consumer
    final Queue<Integer> queue = new ArrayDeque<>();
    static final int piao = 5;

    class producer implements Runnable{
        @Override
        public void run() {
            while (true){
                synchronized (queue){
                    if(queue.size() < piao){
                        int p = (int) (Math.random() * 10);
                        queue.offer(p);
                        System.out.println("生产了 = "+p);
                        queue.notifyAll();
//                        System.out.println("producter唤起了");
                    }else{
                        System.out.println("producer等待了");
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            System.out.println("报错了");
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    class consumer implements Runnable{

        @Override
        public void run() {
            while (true){
                synchronized (queue){
                    if(queue.size() > 0){
                        int p = queue.poll();
                        System.out.println("消费了 = "+p);
                        queue.notifyAll();
//                        System.out.println("consumer唤起了");
                    }else{
                        System.out.println("consumer等待了");
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            System.out.println("报错了");
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }


    @Test
    public void startTest() throws InterruptedException {
        Thread c1 = new Thread(new TestClass.consumer());
        Thread c2 = new Thread(new TestClass.consumer());
        Thread p1 = new Thread(new TestClass.producer());
        Thread p2 = new Thread(new TestClass.producer());

//        c1.start();
//        c2.start();
//        p1.start();
//        p2.start();
//        Thread.sleep(2000);
        ThreadLocal t1 = new ThreadLocal();
        t1.set("123");
        ThreadLocal t2 = new ThreadLocal();
        t2.set("5333");


        System.out.println("t1 = " + t1.get());
        System.out.println("t2 = " + t2.get());
    }
}
