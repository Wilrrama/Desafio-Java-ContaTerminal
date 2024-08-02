import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        System.out.println("Conta Terminal, Seja Bem-Vindo");

        // Configura o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicita e obtém o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        

        // Solicita e obtém o nome do usuário067
        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();

        // Solicita e obtém o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int conta = scanner.nextInt();

        // Define o saldo inicial
        double saldo = 237.48;
        
        scanner.close();

        // Exibe a mensagem final com as informações obtidas
        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
