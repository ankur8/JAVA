package chapter25;

interface AA{
    void a();
    void b();
    void c();
    void d();
}

abstract class BB implements AA{
    public void c(){System.out.println("I am c");}
}

class M extends BB{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
}





public class Example2 {
    public static void main(String args[]){
        AA a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
