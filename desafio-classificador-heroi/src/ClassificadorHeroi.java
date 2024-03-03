package src;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class ClassificadorHeroi {
    public static void main(String[] args){
        // Definindo a codificação UTF-8 para o console
        try {
            System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

            Scanner scanner = new Scanner(System.in);

            System.out.println("\n ---- Classificador de Heróis---- \n");

            System.out.print("Digite o nome do heróico(a): \n");
            String nomeHeroi = scanner.nextLine();

            System.out.println("\n");

            System.out.print("Digite a quantidade de XP (somente números): \n");
            double xp = scanner.nextDouble();

            System.out.println(" \n ---- Resultado: ---- \n");

            String nivelHeroi;

            if (xp < 1000) {
                nivelHeroi = "Ferro";
            } else if (xp >= 1001 && xp <= 2000) {
                nivelHeroi = "Bronze";
            } else if (xp >= 2001 && xp <= 5000) {
                nivelHeroi = "Prata";
            } else if (xp >= 5001 && xp <= 7000) {
                nivelHeroi = "Ouro";
            } else if (xp >= 7001 && xp <= 8000) {
                nivelHeroi = "Platina";
            } else if (xp >= 8001 && xp <= 9000) {
                nivelHeroi = "Ascendente";
            } else if (xp >= 9001 && xp <= 10000) {
                nivelHeroi = "Imortal";
            } else {
                nivelHeroi = "Radiante";
            }

            System.out.println("O Heroico de nome: " + nomeHeroi + " está na Patente: " + nivelHeroi);

            scanner.close();

        }catch (InputMismatchException e){
            System.out.println("\nSomente numéros são aceitos! Tente novamente.");
        }
    }
}
