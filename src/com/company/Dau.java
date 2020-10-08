package com.company;

import java.util.Random;

class Dado {
    private int numero;
    Random aleatorio = new Random();

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int tirar() {

        this.numero = aleatorio.nextInt(6)+1;
        return this.numero;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "numero=" + numero +
                '}';
    }
}