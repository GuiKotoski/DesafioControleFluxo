import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

		System.out.println("Olá! 👋 Seja bem-vindo ao programa Contador.");
		System.out.println("Este programa irá te ajudar a imprimir uma sequência de números com base em dois valores que você informar.");
		System.out.println("Vamos começar!");


        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt(); // ← Lê o primeiro número

        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt(); // ← Lê o segundo número

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // Imprime a mensagem da exceção
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        // Realiza o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
