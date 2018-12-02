package chapter37thread;
// where creating starting the thread in one class and executing that thread in another class

class ChildThread2 implements Runnable {
    public void run()
    {
        System.out.println("execution of child thread starts from here....");
        try{
            for(int i = 5; i > 0; i--) {
                System.out.println(Thread.currentThread().getName()+" : "+ i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

class createThread
{
    Thread child;
    createThread( ChildThread2 ct)
    {
        child=new Thread(ct,"childthread");
        child.start();
        child.setName("demochild"); // to assign name to the thread.
        child.setPriority(Thread.MIN_PRIORITY);
    }
}
public class Thread3 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        ChildThread2 ct=new ChildThread2();
        createThread ct1=new createThread(ct);
    }
}
