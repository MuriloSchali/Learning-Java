package estrutura;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        // Adicionando elementos à pilha
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        // Removendo elementos da pilha
        // int elementoRemovido = pilha.pop();
        // System.out.println("Elemento removido: " + elementoRemovido); // Saída:
        // Elemento removido: 30

        /*
         * System.out.println("Filha completa" + pilha.toString());
         * int elementoRemovido = pilha.pop();
         * System.out.println("Filha completa" + pilha.toString());
         */

        // elementoRemovido = pilha.pop();
        // System.out.println("Elemento removido: " + elementoRemovido); // Saída:
        // Elemento removido: 20

        for (int i = 0; i < pilha.size(); i++) {
            System.out.println("Valor de i" + i);

        }
        System.out.println("Chegamos ao fim da pilha ! ");
    }
}
