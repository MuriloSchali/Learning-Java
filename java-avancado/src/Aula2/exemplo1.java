package Aula2;

import java.util.Arrays;

public class exemplo1 {
    public static void main(String[] args) {

        // funcional
        int[] valoresArray = {1,2,3,4,5,6,7,8};

        Arrays.stream(valoresArray).filter(x -> x % 2 == 0).
                forEach(numero -> System.out.println(numero));


        // imperativo
        for (int i = 0; i < valoresArray.length; i++){
            int valor = 0;
            if(valoresArray[i] % 2 == 0){
                valor = valoresArray[i] * 2;

                if (valor != 0) {
                    System.out.println(valor);
                }
            }
        }
    }

}
