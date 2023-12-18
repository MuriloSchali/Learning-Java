package Aula1;

import java.util.function.UnaryOperator;

public class exemplo2 {
    public static void main(String[] args) {

        //paradigma funcional
        //damos uma regra, declaração de como queremos que o programa se comporte.

        UnaryOperator<Integer> calcularValorVezes3 = valor -> valor * 3;
        int valor = 0;

        System.out.println("O resultado é:" + calcularValorVezes3.apply(10));
    }
}
