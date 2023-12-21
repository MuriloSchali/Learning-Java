package Aula4;

import java.util.function.Predicate;

public class exemplo2 {
    
    public static void main(String[] args) {
        
        //boolean - retorna true ou false (Predicate) 
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        
        System.out.println(estaVazio.test(" "));

    }
}
