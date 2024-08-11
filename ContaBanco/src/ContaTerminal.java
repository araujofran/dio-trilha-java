
import java.util.Locale;
import java.util.Scanner;

// TODO: relizar as perguntas para o usuário


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        ContaBancaria contaBancaria = new ContaBancaria();

         System.out.println ("Digite seu nome: ");
         String nome = scanner.nextLine();
         
         System.out.println ("---------------------------------------------------------------------------------------");
         
         System.out.println ("Digite o número da sua agência: ");
         String numeroDaAgencia = scanner.nextLine();

         System.out.println ("---------------------------------------------------------------------------------------");

                

            contaBancaria.depositarSalario();
          

                     System.out.println(" Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroDaAgencia + " com numero da conta " + contaBancaria.numeroDaConta + " e  o seu saldo  R$  " + contaBancaria.depositarSalario() + " já está disponível para saque!" );

                     System.out.println ("---------------------------------------------------------------------------------------");

       }


       
      
    }

    
    

