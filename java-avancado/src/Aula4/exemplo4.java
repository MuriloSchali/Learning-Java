package Aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class exemplo4 {
    public static void main(String[] args) {

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Arquiteto");
        profissoes.add("Analista de Sistemas");

        //profissoes.stream().filter(profissao -> profissao.startsWith("Analista")).forEach(System.out::println);

        if (profissoes.stream().noneMatch(profissao -> profissao.startsWith("Analista"))) {
            System.out.println("Não existe nenhum registro.");

        }
    
    }
}
