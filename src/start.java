import java.util.Scanner;
public class start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do seu herói: ");
        String nomeHeroi = scanner.nextLine();
        System.out.println("Digite seu nível de experiência atual: ");
        Integer experienciaHeroi = scanner.nextInt();
        String nivelFinal = null;
        Boolean Ferro = experienciaHeroi < 1000;
        Boolean Bronze = experienciaHeroi > 1000 && experienciaHeroi <=2000;
        Boolean Prata = experienciaHeroi > 2000 && experienciaHeroi <=5000;
        Boolean Ouro = experienciaHeroi >5000 && experienciaHeroi <=7000;
        Boolean Platina = experienciaHeroi > 7000 && experienciaHeroi <= 8000;
        Boolean Ascendente = experienciaHeroi > 8000 && experienciaHeroi <= 9000;
        Boolean Imortal = experienciaHeroi > 9000 && experienciaHeroi <= 10000;
        Boolean Radiante = experienciaHeroi >= 10001;

        if (Ferro) {
            nivelFinal = "Ferro";
        } else if (Bronze) {
            nivelFinal = "Bronze";
        } else if (Prata) {
            nivelFinal = "Prata";
        } else if (Ouro) {
            nivelFinal = "Ouro";
        } else if (Platina) {
            nivelFinal = "Platina";
        } else if (Ascendente) {
            nivelFinal = "Ascendente";
        } else if (Imortal) {
            nivelFinal = "Imortal";
        } else if (Radiante) {
            nivelFinal = "Radiante";
        }
        System.out.println("O jogador " + nomeHeroi + " " + "está no nível " + nivelFinal + ".");
        }
    }


