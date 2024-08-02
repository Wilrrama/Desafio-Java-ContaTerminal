# ContaBanco

Este projeto `ContaBanco` recebe dados via terminal contendo as características de uma conta em banco.

## Atributos da Conta

| Atributo      | Tipo    | Exemplo       |
|---------------|---------|---------------|
| Numero        | Inteiro | 1021          |
| Agencia       | Texto   | 067-8         |
| Nome Cliente  | Texto   | MARIO ANDRADE |
| Saldo         | Decimal | 237.48        |

## Instruções

1. Crie a classe `ContaTerminal.java` para realizar toda a codificação do programa.

2. Permita que os dados sejam inseridos via terminal. O usuário receberá uma mensagem solicitando cada informação, por exemplo:

3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

Os campos em `[ ]` devem ser alterados pelas informações que forem inseridas pelos usuários.

## Exemplo de Código

```java
import java.util.Scanner;

public class ContaTerminal {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Por favor, digite o número da Agência!");
     String agencia = scanner.nextLine();
     
     System.out.println("Por favor, digite o número da Conta!");
     int numero = scanner.nextInt();
     
     scanner.nextLine(); // Consumir a linha pendente
     System.out.println("Por favor, digite o seu Nome!");
     String nomeCliente = scanner.nextLine();
     
     System.out.println("Por favor, digite o Saldo!");
     double saldo = scanner.nextDouble();
     
     System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
     
     scanner.close();
 }
}

