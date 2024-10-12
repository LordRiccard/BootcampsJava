import java.util.Scanner;

public class Contador{
    public static void counter(int start, int end) throws ParametrosInvalidosException{
        if(start > end)
            throw new ParametrosInvalidosException(null);

        int n = end - start;
        for(int i=1; i<=n; i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int firstNum, secondNum;

        System.out.println("Digite o primeiro número");
        firstNum = scan.nextInt();

        System.out.println("Digite o segundo número");
        secondNum = scan.nextInt();

        try{
            counter(firstNum, secondNum);
        } catch (ParametrosInvalidosException e){
            System.err.println("Segundo número deve ser maior que o primeiro");
        }

        scan.close();
    }
}