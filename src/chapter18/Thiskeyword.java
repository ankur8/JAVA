package chapter18;



class Example {
    private int l,b,h;
    public void setDimension(int l, int b , int h)
    {
        this.l=l; this.b=b; this.h=h;

    }
    /*public void sendBox(){
       GiftTaker gf=new GiftTaker();
        gf.acceptGift(this);  //passing calling object by this keyword to gifttaker member function of Gifttaker class
    }*/
}


public class Thiskeyword
{
    public static void main(String args[])
    {
        Example t1=new Example();
        t1.setDimension(10,12,5);
        //t1.sendBox();

    }
}
