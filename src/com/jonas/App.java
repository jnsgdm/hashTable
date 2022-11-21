package com.jonas;

import com.jonas.util.HashTable;
import com.jonas.util.Person;
import com.jonas.util.DoublyLinkedList;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean start = true;
        Scanner sc = new Scanner(System.in);
        //DoublyLinkedList list = new DoublyLinkedList();
        HashTable hashTable = new HashTable();
        do{
            System.out.println("=-=-= Tabela Hash =-=-=");
            System.out.println("Quais opções executar?\n");
            System.out.println("1 - adicionar um registro");
            System.out.println("2 - exibir tabela hash");
            System.out.println("3 - deletar um registro");
            int option = sc.nextInt();
            if(option == 1){
                Person person = new Person();
                System.out.println("informe o nome:");
                String name = sc.next();
                System.out.println("informe a prioridade:");
                int priority = sc.nextInt();
                person.setName(name);
                person.setPriority(priority);
                person.setKey(name);
                person.setHash(person.getKey());
                System.out.println(person.toString());
                System.out.println("deseja inserir esses valores? (sim/nao)");
                String ok = sc.next();
                if(ok.equalsIgnoreCase("s") || ok.equalsIgnoreCase("sim")){
                    hashTable.insert(person);
                }else{
                    System.out.println("");
                }
            }else if(option == 2){

            }else if(option == 4){
                System.out.println("Adeus!");
                start = false;
            }
        }while(start);
    }
}
