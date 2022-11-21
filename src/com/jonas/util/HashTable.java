package com.jonas.util;

public class HashTable {
    DoublyLinkedList[] array;

    public HashTable() {
        array = new DoublyLinkedList[10];
        for(int i = 0 ; i < 10 ; i++){
            array[i] = new DoublyLinkedList();
        }
    }

    public void insert(Person person){
        int key = person.getKey()%10;
        array[key].add(person);
    }
}
