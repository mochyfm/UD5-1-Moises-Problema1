package com.problema1.utils;

public class GenericKiwi {
    // He puesto este nombre dado que no había uno previamente especificado
        // Y porque la pronunciación fonética de Queue es Kiwi; eso dijo mi segundo profezor favorito
    private GenericCollection collection = new GenericCollection();

    public void enqueue(Integer element) {
        collection.add(element);
    }

    public Integer dequeue() {
        return (Integer)collection.delete(0);
    }

    public int getNumTotalValores() {
        return collection.getNumValores();
    }

    @Override
    public String toString() {
        String salida = "";
        for (int i = 0; i < getNumTotalValores(); i++) {
            salida += (i + 1) + ". " + collection.getElement(i);
        }
        return salida;
    }
}
