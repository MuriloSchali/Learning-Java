import java.util.Scanner;

public class ClassificadorHeroi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do herói: ");
        String nomeHeroi = scanner.nextLine();

        System.out.print("Digite a quantidade de experiência (XP) do herói: ");
        int xp = scanner.nextInt();

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

        System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivelHeroi);

        scanner.close();
    }
}
