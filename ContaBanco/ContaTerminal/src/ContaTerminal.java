import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Prezado usuário, qual seu nome? ");
        String nome = scanner.next();
        
        System.out.println("Ótimo, poderia digitar sua agência? ");
        String agencia = scanner.next();

        System.out.println("Agora o número da sua conta: ");
        int numeroDaConta = scanner.nextInt();
        
        double saldo = 2.432;


        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("OlÁ, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: "+ agencia);
        System.out.println("Seu saldo: "  + saldo + " já está disponível em sua conta " + numeroDaConta +" Para saque" );
       
        
        
    }
}
