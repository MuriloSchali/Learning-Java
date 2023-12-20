package Aula2;

import java.util.function.UnaryOperator;

public class exemplo3 {

    //imutabilidade
    // Uma vez que a variavel que recebeu um valor, vai possuir esse valor para sempre,
    // ou quando criamos um objeto ele não pode ser modificado.

    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornarDobro = v -> v * 2;
        System.out.println(retornarDobro.apply(valor));
        System.out.println(valor);
    }
}
