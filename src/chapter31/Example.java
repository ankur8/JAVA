package chapter31;

public class Example {
public static void main(String args[]){
    String s1=new String("Computer");
    System.out.println(s1);
 String s2=  s1.toUpperCase();
    System.out.println(s2);
    s2=s1.toLowerCase();
    System.out.println(s2);
    int i=s1.indexOf('m');
    System.out.println("index is: "+i);
    i=s1.indexOf('m',3);//indexOf(char,indexfrom)
    System.out.println("index is: "+i);
    i=s1.indexOf("ute");    //indexof(str)
    System.out.println("index is :"+i);
    i=s1.lastIndexOf('m');
    System.out.println("index is:"+i) ;
    char[] ch={'j','a','v','a','t','p','o','i','n','t'};   //an array of character works same as java string.
    String s=new String(ch);
   System.out.println("s= "+s);

    String s6="new tech";
    System.out.println(ch);  //print javapoint but if you concatenate "ch= "+ch will give junk as println can print object

    String[] a1= new String[] {"1", "2", "3"};   //this is an array of string objects not a string class object
    System.out.println(a1);  //print reference or like junk

}
}
