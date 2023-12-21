package Aula4;

import java.util.function.Function;

public class exemplo1 {
    //Passo um parâmetro e ele ira responder assim. 

    public static void main(String[] args) {
        
        /*Function<String,String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornaNomeAoContrario.apply("Murilo"));

        Function<String,Integer> converterStringParaInteiro = string -> Integer.valueOf(string) * 2;
        System.out.println(converterStringParaInteiro.apply("20"));*/

        Function<String, Boolean> verificarSeStringENula = s -> (s == null || s.trim().isEmpty() || s.trim().equals("null"));         
        
        System.out.println(verificarSeStringENula.apply("Murilo"));
        System.out.println(verificarSeStringENula.apply(" "));
    }
}
