package com.jonas.util;

public class DoublyLinkedList {
    Node start, end, temp;
    int length;

    public DoublyLinkedList(){
        this.start = this.end = null;
    }

    public void add(Person person){
        Node newNode = new Node(person);
        if(start == null){
            newNode.setNext(newNode);
            end = newNode;
        }else{
            if(person.getPriority() == 1){
                temp = start;
                for(int i = 0 ; i < length ; i ++){
                    if(temp.getNext().getInfo().getPriority() == 0){
                        temp = temp.getNext();
                    }
                }
            }
        }
        start = newNode;
        length++;
    }

    public void showFromTheEnd() {
        temp = end;
        String lista = "";
        if (start == null) {
            System.out.println("Lista: * lista vazia *");
        } else {
            for (int i = 0; i < length; i++) {
                if (temp == start) {
                    lista = lista + temp.getInfo();
                } else {
                    lista = lista + temp.getInfo() + " -> ";
                }
                temp = temp.getPrev();
            }
            System.out.println("Lista: [" + lista + "]");
        }
    }
}
