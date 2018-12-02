package chapter28;
import java.util.*;



public class Example {
    public static void main(String args[]){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);  // for taking input from user use scanner class object
        System.out.println("Enter 5 number ");
        for (int i=0;i<5;i++)
            arr[i]=sc.nextInt();

            for(int i=0;i<5;i++)
                System.out.println("arr["+i+"]="+arr[i]);
    }
}
