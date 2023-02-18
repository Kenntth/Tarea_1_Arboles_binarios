package org.example;

public class Nodoarbol {
private int valor;
private Nodoarbol nodoizquierdo;
private Nodoarbol nododerecho;
public Nodoarbol(int valor){
this.valor=valor;
this.nododerecho=null;
this.nodoizquierdo=null;
}

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodoarbol getNodoizquierdo() {
        return nodoizquierdo;
    }



    public Nodoarbol getNododerecho() {
        return nododerecho;
    }

   public void insertar(int valor_){
   if (valor_< this.valor){
       //insertar en el lado izquierdo
if (this.nodoizquierdo==null){
    this.nodoizquierdo=new Nodoarbol(valor_);
}else {
    this.nodoizquierdo.insertar(valor_);
}
   }else{
       //insertar en el nodo derecho
       if (this.nododerecho==null){
           this.nododerecho=new Nodoarbol(valor_);
       }else {
           this.nododerecho.insertar(valor_);
       }

   }
   }





}
