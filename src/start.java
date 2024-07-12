    import java.util.Scanner;
    public class start {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o nome do seu herói: ");
            String nomeHeroi = scanner.nextLine();
            System.out.println("Digite seu nível de experiência atual: ");
            int experienciaHeroi = scanner.nextInt();
            String nivelFinal = null;
            boolean Ferro = experienciaHeroi < 1000;
            boolean Bronze = experienciaHeroi > 1000 && experienciaHeroi <=2000;
            boolean Prata = experienciaHeroi > 2000 && experienciaHeroi <=5000;
            boolean Ouro = experienciaHeroi >5000 && experienciaHeroi <=7000;
            boolean Platina = experienciaHeroi > 7000 && experienciaHeroi <= 8000;
            boolean Ascendente = experienciaHeroi > 8000 && experienciaHeroi <= 9000;
            boolean Imortal = experienciaHeroi > 9000 && experienciaHeroi <= 10000;
            boolean Radiante = experienciaHeroi >= 10001;

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


