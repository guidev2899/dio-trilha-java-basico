import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        Integer conta = 1000 +  random.nextInt(9000);

        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite o número da sua agência: ");
        String agencia = input.nextLine();

        System.out.println("Digite seu saldo: ");
        Float saldo = input.nextFloat();



    }
}
