package chapter37thread;


class A implements Runnable
{
    int i;

    public void run() {
        for (i = 0; i <= 10; i++)
            System.out.println(Thread.currentThread().getName()+ "Thread A ");
    }
}

class B implements Runnable
{
    int i;
    public void run(){
        //try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println(e);}   //sleep Thread B then thread schedular picks up another thread and so on.
        for (i = 0; i <= 10; i++)
            System.out.println("Thread B ");
    }
}

public class Threadrun1 {
public static void  main(String[] args)
{
   // Runnable i = new A();
    //Thread t1=new Thread(i);
    Thread t1=new Thread(new A(),"class-A");
    Thread t2=new Thread(new B());
    t1.setPriority(10);    // setting priority for t1 thread higher than t2
t1.start();

//t1.setName("class-A");  // you can also assign name by writing super("threadname") with in run method of each A and B class
t2.start();

System.out.println(t1.getPriority());
Thread.currentThread().setName("YOMAIN");   // setting main thread of main method
System.out.println(Thread.currentThread().getName());  //getting name of main method i.e main thread parent of all
double[] mylist={1.9,4.5,3.4,4.4};

for (double element:mylist)     // for each loop enhanced for loop traverse array without index variable
     System.out.println(element);

}
}
