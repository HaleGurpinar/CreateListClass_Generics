package com.patika;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> myList= new MyList<>();
        System.out.println("List Case : " + (myList.isEmpty() ? "Empty" : "Full"));
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);
        myList.add(60);
        myList.add(70);
        myList.add(80);
        myList.add(90);
        myList.add(100);
        //myList.add(110);
        System.out.println("Number of Elements in Array : " + myList.size());
        System.out.println("Capacity of Array : " + myList.getCapacity());
        System.out.println(myList.toString());
        System.out.println("List Case : " + (myList.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements in Array : " + myList.size());
        System.out.println("Capacity of Array : " + myList.getCapacity());
        System.out.println(myList.get(3));
        myList.remove(3);
        System.out.println(myList.get(4));
        myList.set(3,55);
        System.out.println(myList.get(3));
        System.out.println(myList.get(4));
        System.out.println(myList.toString());
        System.out.println(myList.indexOf(60));
        System.out.println(myList.lastIndexOf(30));
        Object[] array= myList.toArray();
        System.out.println(array[0]);
        System.out.println(myList.sublist(0,2));
        System.out.println(myList.contains(90));






    }
}
