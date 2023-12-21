package Aula3;

import java.util.function.Consumer;

public class exemplo1 {
    // Consumer 
    
    public static void main(String[] args) {
        
    Consumer<String> imprimirUmaFrase = System.out::println;

    imprimirUmaFrase.accept("Hello Word");

    }
    
}
