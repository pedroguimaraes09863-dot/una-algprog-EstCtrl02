import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char resposta;
        int tentativas = 0;
        boolean acertou = false;

        do {
            tentativas++;

            // Exemplo de ADS - lógica/programação //
            System.out.println("\nQuestão:");
            System.out.println("Qual estrutura de repetição executa pelo menos uma vez, mesmo que a condição seja falsa?");
            System.out.println("a) for");
            System.out.println("b) while");
            System.out.println("c) do-while");
            System.out.println("d) if");
            System.out.println("e) switch");

            System.out.print("Digite sua resposta (a-e): ");
            resposta = scanner.next().toLowerCase().charAt(0);

            switch (resposta) {
                case 'c':
                    System.out.println("Resposta correta!");
                    System.out.println("Você acertou na tentativa " + tentativas + ".");
                    acertou = true;
                    break;

                case 'a':
                case 'b':
                case 'd':
                case 'e':
                    System.out.println("Resposta incorreta.");
                    if (tentativas < 3) {
                        System.out.println("Tente novamente.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    tentativas--; // não conta tentativa inválida (essa parte foi a IA) //
            }

        } while (!acertou && tentativas < 3);

        if (!acertou) {
            System.out.println("Resposta incorreta nas 3 tentativas.");
        }

        scanner.close();
    }
}