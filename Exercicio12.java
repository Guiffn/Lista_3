import java.util.Scanner;

public class Exercicio12 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        char continuar;

        do {
            System.out.print("Digite o ano do carro: ");
            int ano = leitor.nextInt();

            System.out.print("Digite o preço do carro: ");
            double preco = leitor.nextDouble();

            double desconto = DescontoCalculator.calcularDesconto(ano);
            double valorDesconto = preco * desconto;
            double precoComDesconto = preco - valorDesconto;

            System.out.printf("Desconto: R$%.2f\n", valorDesconto);
            System.out.printf("Valor a ser pago pelo cliente: R$%.2f\n", precoComDesconto);

            if (ano <= 2000) {
                totalCarrosAte2000++;
            }
            totalGeral++;

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            continuar = leitor.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        System.out.println("Total de carros até o ano 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        leitor.close();
    }
}