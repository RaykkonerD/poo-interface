package jogo2;

import java.util.ArrayList;
import java.util.Iterator;

public class IteradorInventario implements Iterator {
    private Inventario inventario;
    private int indexCorrente;

    public IteradorInventario(Inventario inventario){
        this.inventario = inventario;
        this.indexCorrente = 0;
    }

    @Override
    public boolean hasNext(){
        return indexCorrente < this.inventario.getTamanho();
    }

    @Override
    public ItemJogo next(){
        return this.inventario.getItem(indexCorrente++);
    }
}