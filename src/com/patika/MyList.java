package com.patika;

import java.util.Arrays;

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
        int size=0;
        for (T t : list) {
            if (t != null) {
                size++;
            }
        }
        return size;
    }

    public  int indexOf(T data){
        int curIndex=0;

        while (curIndex< size){
            if (list[curIndex] == data)
                return curIndex;
            curIndex++;
        }
        return -1;
    }

    public  int lastIndexOf(T data){
        int curIndex=size-1;

        while (curIndex>=0){
            if (list[curIndex] == data)
                return curIndex;
            curIndex--;
        }
        return -1;
    }

    public T[] toArray(){

        T[] items= (T[]) new Object[size];

        for (int i=0;i<size;i++){
            items[i]=list[i];
        }
        return items;
    }

    public void clear(){
        for (int i=0;i<=list.length;i++){
            list[i]=null;
        }
    }

    public MyList <T> sublist(int start,int finish){
        int newSize=finish-start+1;
        MyList <T> newList= new MyList<>(newSize);

        for (int i=start;i<=finish;i++){
            newList.add(list[i]);
        }
        return newList;
    }

    public boolean contains(T data){
        return indexOf(data)!= -1;
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
        if (index < 0 || index > this.getCapacity()){
            for (int i=index+1;i<this.size();i++){
                this.list[i-1]= this.list[i];
                list[index]=null;
            }
        }else{
            return;
        }
       // setSize(getSize() - 1);
    }

    public T set(int index, T data){
        if (index < 0 || index > size){
            return null;
        }else {
            return list[index] = data;
        }

        }


     @Override
     public String toString() {
         return Arrays.toString(list);
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
 }

