package Aula2;

import java.util.function.BiPredicate;

public class exemplo2 {

    //funções puras
    //invocada mais de uma vez, produz exatamente o mesmo resultado.
    //o mesmo parametro, o mesmo valor.

    public static void main(String[] args) {
        BiPredicate<Integer,Integer> verificaSeEMaior = (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println("13 é maior que 12 ? :"+verificaSeEMaior.test(13,12));
        System.out.println("10 é maior que 12 ? :" + verificaSeEMaior.test(10,12));


    }


}
