package chapter58anonymousclass;

//we are creating a instance of subclass and anonymous class is subclass of greeting.

class greeting{
    public void sayhello(){
        System.out.println("Hello");
    }
}

class india{
    greeting g=new greeting(){     // greeting g=new greeting(){} so this means ye brackets {} denotes subclass of greeting
        public void sayhello(){
            System.out.println("IN inner class");
       }
    };     //semicolon because it all one statement. Here we are making reference var of greeting class

}
public class anonymousclass {

    public static void  main(String [] args){
        india i1=new india();
        i1.g.sayhello();  // we can call only those methods of anynomous class which are overriden and belongs to greeting i.e parent class type
        // due to early binding/compile time binding and late /dynamic bindings incase of override.
    }
}
