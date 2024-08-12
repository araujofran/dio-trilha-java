
import java.util.Scanner;
import java.util.Locale;

public class menuTV {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println( " +++++++++++ Menu do Controle Sansung ++++++++++");
        System.out.println("OPÇÃO 2 =   CULTURA ");
        System.out.println("OPÇÃO 5 =   GLOBO ");
        System.out.println("OPÇÃO 7 =   RECORD ");
        System.out.println("OPÇÃO 9 =   REDE TV ");
        System.out.println("OPÇÃO 11 =  GAZETA ");
        System.out.println("OPÇÃO 13 =  BANDEIRANTES ");

        System.out.println( " +++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println( " Ecolha a opção do menu Controle: ");
       
        int opcao = scanner.nextInt();

        int cont = 0;

        while (opcao == 2 || opcao == 5||opcao == 7|| opcao == 9|| opcao == 11 ||opcao == 13 && cont <10) {

            cont ++;

        if (opcao == 2){

            System.out.println( " TV CULTURA ");
            break;
        }else if (opcao == 5) {
            System.out.println( " TV GLOBO ");
            break;
            
        } else if (opcao == 7) {
            System.out.println( " TV RECORD ");
            break;
            
        } else if (opcao == 9) {
            System.out.println( " REDE TV ");
            break;
            
        } else if (opcao == 11) {
            System.out.println( " TV GAZETA ");
            break;
            
        } else if (opcao == 13) {
            System.out.println( " TV BANDEIRANTES");
            break;
            
        } 
        
     }
         
    }
    }

