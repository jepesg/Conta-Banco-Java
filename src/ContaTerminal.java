import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

        public static void main(String[] args){
            //criando objeto Scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o seu nome:");
            String nomeCliente = scanner.next();

            System.out.println("Digite a sua agencia:");
            String agencia = scanner.next();

            System.out.println("Digite o numero da sua conta:");
            int numeroConta = scanner.nextInt();

            System.out.println("Digite o seu saldo:");
            double saldoConta = scanner.nextDouble();

            System.out.println("Seja bem-vindo Sr(a) " + nomeCliente + ", informamos que sua conta e sua agencia sao: " + numeroConta+"-"+agencia);
            System.out.println("E o seu saldo em conta: " + saldoConta);
        }
}


