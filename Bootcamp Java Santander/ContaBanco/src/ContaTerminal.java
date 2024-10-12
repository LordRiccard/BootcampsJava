import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta");
        int numero = scan.nextInt();
        scan.nextLine();

        System.out.println("Por favor, digite o número da agência");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o nome do cliente");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o saldo");
        String aux = scan.nextLine();
        double saldo = Float.parseFloat(aux);

        System.out.println("Olá " + nomeCliente 
        + ", obrigado por criar uma conta em nosso"
        + " banco, sua agência é " + agencia + ", conta"
        + numero + " e seu saldo " + saldo + " já está "
        + "disponível para saque");

        scan.close();
    }
}