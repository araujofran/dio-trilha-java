
public class ContaBancaria {

   String nome = " "; 
   String numeroDaAgencia = " ";
   Double saldoDaConta = 0.00;
   int numeroDaConta = 1021;
   Double salarioMensal = 2500.00;
   
   Double extrato;
   
   public double depositarSalario() {

   double extrato = saldoDaConta + salarioMensal;
   return extrato;
    
}

}