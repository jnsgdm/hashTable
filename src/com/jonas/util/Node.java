package com.jonas.util;

public class Node {
    private Person info;
    private Node next, prev;

    public Node(Person info){
        this.info = info;
        this.next = null;
        this.prev = null;
    }

    public Person getInfo() {
        return info;
    }

    public void setInfo(Person info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
