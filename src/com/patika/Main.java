package com.patika;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> myList= new MyList<>();
        System.out.println("List Case : " + (myList.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements in Array : " + myList.size());
        System.out.println("Capacity of Array : "+ myList.getCapacity());
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
        myList.add(110);
        myList.add(120);


        System.out.println("List Case : " + (myList.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of Elements in Array : " + myList.size());
        //Doubled capacity because of exceeding 10 elements
        System.out.println("Capacity of Array : "+ myList.getCapacity());
        System.out.println(myList.toString());

        // Return index of entered value
        System.out.println("Index : " + myList.indexOf(40));

        // Return -1 if method can not find value
        System.out.println("Index :" + myList.indexOf(140));

        // Return last index of list
        System.out.println("Index : " + myList.lastIndexOf(20));

        // Returns the list as an Object[] array.
        Object[] dizi = myList.toArray();
        System.out.println("First element of Object array :" + dizi[0]);

        // Create a sublist with list type
        System.out.println("New sublist from array elements");
        MyList<Integer> subList = myList.subList(0, 3);
        System.out.println(subList.toString());

        // Number in list or not
        System.out.println("20 value in my array: " + myList.contains(20));
        System.out.println("105 value in my array: " + myList.contains(105));

        // Clear all list and assign null
        myList.clear();
        System.out.println(myList.toString());
    }

    }

