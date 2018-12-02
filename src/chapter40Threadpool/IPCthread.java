package chapter40Threadpool;
//wait and notify example . IPC

class Operation {
    int n;
    volatile boolean flagset = false;
    synchronized int get() {
        while(!flagset)
            try {
                wait();
                System.out.println("helllloooo2");
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println("Got: " + n);
        flagset= false;
        notify();
        return n;
    }
    synchronized void put(int n) {
        while(flagset)
            try {
                wait();
                System.out.println("helllloooo");
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        this.n = n;
        flagset = true;
        System.out.println("Put: " + n);
        notify();
    }
}//end Operation
class Producer implements Runnable {
    Operation q;
    Producer(Operation q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        try {
            while(true) {
                q.put(i++);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}//end Producer

class Consumer implements Runnable {
    Operation q;
    Consumer(Operation q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        try {
            while(true) {
                int gotvalue=q.get();
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}//end Consumer



public class IPCthread {
    public static void main(String args[]) {
        Operation q=new Operation();
        new Producer(q);
        new Consumer(q);
    }
}   // end ProducerConsumerProblem
