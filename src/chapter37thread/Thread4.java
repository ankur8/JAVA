package chapter37thread;
//creating multiple threads
class ChildThreads implements Runnable
{
    Thread child;
    ChildThreads(String name)
    {
        child=new Thread(this,name);
        child.start();
    }
    public void run()
    {String name=Thread.currentThread().getName();
        System.out.println("execution of "+name+" starts from here....");
        try{
            for(int i = 5; i > 0; i--) {
                System.out.println(name+" : "+ i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting "+name);
    }
}
public class Thread4 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        ChildThreads ct1=new ChildThreads("Child 1");
        ChildThreads ct2=new ChildThreads("Child 2");
        ChildThreads ct3=new ChildThreads("Child 3");
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}


