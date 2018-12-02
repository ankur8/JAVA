package chapter24;
//abstract class and method in java

    abstract class Bike{
        abstract void run();
    }
    class Honda4 extends Bike{
        void run(){System.out.println("running safely..");}}
        class Example{
        public static void main(String args[]){
            Bike obj = new Honda4();
            obj.run();
        }
    }

