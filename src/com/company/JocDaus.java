package com.company;

public class JocDaus {

    Dado dado1;
    Dado dado2;
    Dado dado3;

    public JocDaus(){

        dado1 = new Dado();
        dado2= new Dado();
        dado3 = new Dado();

    }

    public boolean jugar() {
        dado1.tirar();
        dado2.tirar();
        dado3.tirar();
        System.out.println(" Dado 1: "+ dado1.getNumero()+" || Dado 2: "+ dado2.getNumero()+" || Dado 3: "+dado3.getNumero());
        if ((dado1.getNumero() == dado2.getNumero()) && (dado2.getNumero() == dado3.getNumero()) && (dado1.getNumero() == dado3.getNumero())) return true;
        else {
            return false;
        }
    }
}