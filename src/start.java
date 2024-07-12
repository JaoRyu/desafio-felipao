import java.util.Scanner;
public class start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite seu nível de experiência atual: ");
        Integer experienciaHeroi = scanner.nextInt();
        String nomeHeroi = "Ryuzaki";

        if(experienciaHeroi < 1000) {
            System.out.println("Seu nível atual é Ferro");

        }

        }

    }
