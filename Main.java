import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        caixa caixa1 = new caixa ("joao", 1000.0, 145); //ex de como criar conta

        boolean continuar = true;

        while (continuar){
            System.out.println("#####MENU#####");
            System.out.println("1-Cadastro de conta");
            System.out.println("2-Consultar saldo");
            System.out.println("3-Saque");
            System.out.println("4-Sair ");
            System.out.println("Digite a opção desejada ");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome da sua conta");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o número da sua conta");
                    int agencia = scanner.nextInt();
                    System.out.println("Digite o saldo inicial da sua  conta ");
                    double saldoInicial = scanner.nextDouble();
                    if (saldoInicial < 0) {
                    System.out.println("O saldo inicial deve ser positivo");
                    break;
                case 2:
                    caixa1.imprime();
                    break;
                case 3:
                    System.out.println("Digite o valor do saque");
                    double valorSaque = scanner.nextDouble();
                    agencia.sacar(valorSaque);
                    break;
                    case 4:
                        continuar = false;
                        System.out.println("Encerrando o programa...");
                        System.out.println("Até mais");
                        break;
                default:
                    System.out.println("Digite uma opção valida");
                }
            }
        }

        //caixa2.sacar(1500);
    }
}
