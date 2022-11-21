package com.jonas.util;

public class Person {
    private String name;
    private int key;
    private int priority;
    private int hash;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public void setKey(String name) {
        int value = 0;
        for(char e : name.toCharArray()){
            value = value + (int)e;
        }
        this.key = value;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int key) {
        this.hash = key%10;
    }

    @Override
    public String toString() {
        return "*****************\n"
                +"nome: " + name + "\n"
                +"chave: " + key + "\n"
                +"prioridade: " + priority + "\n"
                +"hash: " + hash + "\n"
                + "*****************";
    }
}
