package chapter29;

public class Example {
    public static void main(String args[])
    {
        int [][]a=new int[4][];
        //System.out.println("a[0][0]"+a[0][0]); //a[0] is having null but a[0][0] is pointing to nothing and do not exist so it throws null printer exception
        System.out.println("a[0][0]"+a[0]); // a[0] will print null now
        System.out.println(a.length);  // print 4 as a point to array which has 4 length.
        //System.out.println(a[0].length); // null pointer exception as a[0] is not pointing to anyting and has null;

        a[0]=new int[5];
        a[1]=new int[3];
        System.out.println("Length="+a[1].length);  // since a[1] is now poiting to 3 blocks of arrary instead of null so it prints 3 as length


    }
}
