import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Dear user, what's your name? ");
        String name = scanner.next();
        
        System.out.println("Great, could you type in your agency?");
        String agency = scanner.next();

        System.out.println("Now your account number: ");
        int accountNumber = scanner.nextInt();
        
        double balance = 2.432;


        
        System.out.println("Hi, " + name + ", Thank you for creating an account with our bank, your branch is: "+ agency);
        System.out.println("Your balance: "  + balance + " is now available in your account  " + accountNumber + "For Withdrawal" );
       
        
        
    }
}
