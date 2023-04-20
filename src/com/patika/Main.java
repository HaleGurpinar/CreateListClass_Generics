package com.patika;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> myList= new MyList<>();
        System.out.println("List Case : " + (myList.isEmpty() ? "Empty" : "Full"));
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println("Number of Elements in Array : " + myList.size());
        System.out.println("Capacity of Array : " + myList.getCapacity());
        System.out.println("Number of Elements in Array : " + myList.size());
        System.out.println("Capacity of Array : " + myList.getCapacity());
        myList.add(50);
        myList.add(60);
        myList.add(70);
        myList.add(80);
        myList.add(90);
       /* myList.add(100);
        myList.add(110);*/
        System.out.println(myList);
        System.out.println("Number of Elements in Array : " + myList.size());
        System.out.println("Capacity of Array : " + myList.getCapacity());


    }
}
