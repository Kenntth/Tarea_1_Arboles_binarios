package org.example;

public class Main {



    public static void main(String[] args) {

       Arbol arbol= new Arbol();
       arbol.insertar(40);
        arbol.insertar(65);
        arbol.insertar(5);
        arbol.insertar(13);
        arbol.insertar(20);
        arbol.insertar(2);
        arbol.insertar(45);
        System.out.println("Inorden= ");
        arbol.darinorden();

        System.out.println("Postorden= ");
        arbol.darpostorden();

        System.out.println("Preorden= ");
        arbol.darpreorden();

    }
}