package chapter256;
//Example of nested interface which is declared within the class
class A{
    interface Message{
        void msg();
    }
}

class Example6 implements A.Message{
    public void msg(){System.out.println("Hello nested interface");}

    public static void main(String args[]){
        A.Message message=new Example6();//upcasting here
        message.msg();
    }
}
