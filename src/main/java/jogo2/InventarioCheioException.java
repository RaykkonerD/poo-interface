package jogo2;

public class InventarioCheioException extends Exception {
    public InventarioCheioException(){
        super("O inventário já está cheio.");
    }
}