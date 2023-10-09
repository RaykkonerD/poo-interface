package stack;

import java.util.ArrayList;

public class Pilha implements Stack {
    private int tamanho;
    private ArrayList<String> listaDeItens;

    public Pilha() {
        this.listaDeItens = new ArrayList<>();
        this.tamanho = 10;
    }

    @Override
    public void push(String item) {
        if(getLista().size() < getTamanho()) {
            this.listaDeItens.add(item);
        }
    }

    @Override
    public String pop() {
        return this.listaDeItens.remove(getLista().size() - 1);
    }

    @Override
    public String peek() {
        if(getLista().size() == 0){
            return null;
        }

        return getLista().get(getLista().size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return getLista().size() == 0;
    }

    @Override
    public boolean isFull() {
        return getLista().size() == this.getTamanho();
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public ArrayList<String> getLista(){
        return this.listaDeItens;
    }

    public String toString() {
        String strFinal = "";

        for(String item : getLista()) {
            strFinal += item + ", ";
        }

        return strFinal;
    }
}