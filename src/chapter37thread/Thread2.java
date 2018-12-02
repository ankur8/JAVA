package chapter37thread;
//where creating, starting and executing a thread in same class  with runnable
class ChildThread1 implements Runnable
{
    Thread child;
    ChildThread1()
    {
        child=new Thread(this,"childthread");
        child.start();
        child.setName("demochild"); // to assign name to the thread again with setName.
        child.setPriority(Thread.MIN_PRIORITY);
    }
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
public class Thread2 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        ChildThread1 ct=new ChildThread1();
    }
}

