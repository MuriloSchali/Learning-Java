package Aula4;

import java.util.stream.Stream;

public class exemplo3 {
    public static void main(String[] args) {
        String[] nomes = {"João", "Paulo", "Murilo", "Ricardo", "Isadora", "Java", "Oliveira"};

        Integer[] numeros = {1,2,3,4,5};

        imprimirTodosNomes(nomes);
        System.out.println("\n -------------------------- \n");
        imprimirDobroDeCadaLista(numeros);

   }

   static void imprimirTodosNomes(String... nomes){
    for(String nome : nomes){
        System.out.println("Nome: "+ nome);
 
    }
     System.out.println("\n -------------------------- \n");
     Stream.of(nomes).forEach(nome -> System.out.println("Imprimindo pelo forEach: " + nome));
   }

   //três pontinhos para simbolizar um array, mesma coisa []
   static void imprimirDobroDeCadaLista(Integer... numeros){
    for(Integer numero : numeros){
        System.out.println(numero*2);
    }
   }
    
}
