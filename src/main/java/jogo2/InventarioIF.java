package jogo2;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public interface InventarioIF extends Iterable<ItemJogo> {
    void setTamanho(int tamanho);
    int getTamanho();
    void adicionarItem(ItemJogo item) throws InventarioCheioException;
    ItemJogo getItem(int index);

    void removerItem(int indice);

    boolean contemItem(ItemJogo item);

    List<ItemJogo> getInventario();

    @Override
    Iterator<ItemJogo> iterator();

    // Não é necessário implementar o método forEach
    // Deixe o corpo do método vazio
    @Override
    void forEach(Consumer<? super ItemJogo> action);

    // Não é necessário implementar o método spliterator
    // Deixe o corpo do método vazio e retorne null
    @Override
    Spliterator<ItemJogo> spliterator();
} 