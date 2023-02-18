package org.example;

public class Arbol {
    Nodoarbol inicial;
    public Arbol(){
        this.inicial=null;

    }
    public void insertar(int valor){
        if (this.inicial==null){
            this.inicial=new Nodoarbol(valor);
        }else{
            this.inicial.insertar(valor);
        }
    }


    public void darpreorden(){
        this.preorden(this.inicial);
    }
public void preorden(Nodoarbol nodo){

        if (nodo==null){
            return;
        }else{
            System.out.println(nodo.getValor()+" ");
            preorden(nodo.getNodoizquierdo());
            preorden(nodo.getNododerecho());

        }
}


    public void darinorden(){
        this.inorden(this.inicial);
    }
    public void inorden(Nodoarbol nodo){

        if (nodo==null){
            return;
        }else{
            inorden(nodo.getNodoizquierdo());
            System.out.println(nodo.getValor()+" ");
            inorden(nodo.getNododerecho());

        }
    }


    public void darpostorden(){
        this.postorden(this.inicial);
    }
    public void postorden(Nodoarbol nodo){

        if (nodo==null){
            return;
        }else{
            postorden(nodo.getNodoizquierdo());
            postorden(nodo.getNododerecho());
            System.out.println(nodo.getValor()+" ");

        }
    }

}
