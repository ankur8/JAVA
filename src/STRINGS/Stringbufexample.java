package STRINGS;
//Java StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
//
//Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.

public class Stringbufexample {

    Student student;
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("BuuB");
        StringBuffer sb1=sb.reverse();
        System.out.println("123"+10);
        if (sb.equals(sb1)) {
            System.out.println("string is palandrom");
        } else
            System.out.println("string is not palandrom");



        Student s = new Student();
        s.age = 10;
        s.name = "Sahil";
        System.out.println(s);

        Student s2 = null;
        System.out.println(s2);

    }



    private  static class Student {
        private String name;
        private int age;


        @Override
        public String toString() {
            return name +"    " + age;
        }
    }
    }

