import java. util. Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome;
        double saldo;

        Scanner scan = new Scanner(System.in);

        System.out.println("------------CONTA BANCARIA---------------"11);
        System.out.println();
        System.out.println("Por favor, digite o numero da angencia ! ");
        agencia = scan.next();

        System.out.println();
        System.out.println("Por favor, digite o numero da conta: ");
        numero = scan.nextInt();

        System.out.println();
        System.out.println("Por favor, digite seu nome: ");  
        nome = scan.next();

        System.out.println();
        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scan.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nome, agencia, numero, saldo);

        scan.close();
    }
}
