package com.patika;

import java.lang.reflect.Array;

 class MyList<T>{

    private int capacity;
    private int size=0;

     private T[] list;

    public MyList() {
       setCapacity(10);
       this.list=(T[]) new Object[getCapacity()];
    }

    public MyList(int capacity) {
        this.size=0;
        this.capacity=capacity;
        this.list= (T[]) new Object[capacity];
    }

    public int size(){
        int c=0;
        for (T t : list) {
            if (t != null) {
                c++;
            }
        }
        return c;
    }

    public int getCapacity() {
        return capacity;
    }

     public void setCapacity(int capacity) {
         this.capacity = capacity;
     }

     public void add(T data) {

         if (capacity >= size) {
             this.list[size] = data;
             setSize(getSize() + 1);
         } else {
           T[]  tempList = (T[]) new Object[(this.capacity)];
             setCapacity(getCapacity() * 2);

             int index = 0;
             for (T val : list) {
                 tempList[index] = val;
                 index++;
             }

             list = (T[]) new Object[(getCapacity())];

             index = 0;
             for (T val : tempList) {
                 list[index] = val;
                 index++;
             }

             this.list[size()] = data;
             setSize(getSize() + 1);
         }
       /* if (this.size>=this.capacity){
            int newCapacity= capacity*2;
            T[] newList=(T[]) new Object[(newCapacity)];
            System.arraycopy(list, 0, newList, 0, list.length);
            list=newList;
        }else{
            list[size++]= data;
        }*/

    }

    public T get(int index){
        if (index<=getSize()){
            return list[index];
        } else {
            return null;
        }
    }

    public void remove(int index){
        if (index<=getSize()){
            for (int i=index;i<this.size;i++){
                this.list[i+1]=this.list[i];
                list[index]=null;
            }
        }else{
            return;
        }
    }

     public boolean isEmpty(){
         return size==0;
         }

     public int getSize() {
         return size;
     }

     public void setSize(int size) {
         this.size = size;
     }
 }

