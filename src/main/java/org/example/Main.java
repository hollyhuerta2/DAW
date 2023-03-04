package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String>yoda = new ArrayList<String>();
        yoda.add("Do.");
        yoda.add("Or.");
        yoda.add("do");
        yoda.add("not");
        yoda.add("there");
        yoda.add("is");

       /* Iterator<String> i = yoda.iterator(); //con un iterador
            while(i.hasNext()){
                System.out.println(i.next());
            }*/
       /* System.out.println("LAMBDA"); //con lambda
        yoda.forEach((ott)->{System.out.println(ott);});*/

        System.out.println("otro metodo: ");
        for(String n: yoda){
            System.out.println(n);
        }
    }
}