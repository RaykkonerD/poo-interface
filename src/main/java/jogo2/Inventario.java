package jogo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Inventario implements InventarioIF {
    private ArrayList<ItemJogo> lista;
    private int tamanho;

    public Inventario(){
        this.lista = new ArrayList<>();
        this.tamanho = 4;
    }

    @Override
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    @Override
    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public void adicionarItem(ItemJogo item) throws InventarioCheioException {
        if(this.lista.size() == getTamanho()){
            throw new InventarioCheioException();
        }
        
        this.lista.add(item);
    }

    @Override
    public ItemJogo getItem(int index){
        return this.lista.get(index);
    }

    @Override
    public ArrayList<ItemJogo> getInventario(){
        return this.lista;
    }

    @Override
    public boolean contemItem(ItemJogo item){
        return getInventario().contains(item);
    }

    @Override
    public void removerItem(int index){
        this.lista.remove(index);
    }

    @Override
    public Iterator<ItemJogo> iterator(){
        return new IteradorInventario(this);
    }

    @Override
    public void forEach(Consumer<? super ItemJogo> action){

    }

    @Override
    public Spliterator<ItemJogo> spliterator(){
        return null;
    }
}
