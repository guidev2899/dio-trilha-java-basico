import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        Integer conta = 1000 +  random.nextInt(9000); //gera um número aleatorio entre 1000 e 9000

        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite o número da sua agência: ");
        String agencia = input.nextLine();

        System.out.println("Digite seu saldo: ");
        Float saldo = input.nextFloat();

        System.out.println("Olá " + nome + ", Obrigado por criar uma conta em nosso\r\n" + //
                        "banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$: " + saldo + " já está disponível para saque.\r\n" + //
                        "");

    }
}
