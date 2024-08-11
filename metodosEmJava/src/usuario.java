public class usuario {
    public static void main(String[] args) throws Exception {
        
        smartTv smartTv = new smartTv();

       System.out.println( "---------------------------------------------------------");

        System.out.println("TV ligada ? " + smartTv.ligada);
        
            smartTv.desligar();

            System.out.println(" Novo Status: TV ligada ? " + smartTv.ligada);
            
            smartTv.ligar();

            System.out.println(" Novo Status: TV ligada ? " + smartTv.ligada);
        
        System.out.println( "---------------------------------------------------------");

        System.out.println("Volume atual : " + smartTv.volume);
        
        smartTv.diminuirVolume();
        System.out.println("Diminuindo o Volume atual : " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Diminuindo o Volume atual : " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Aumentando o Volume atual : " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Diminuindo o Volume atual : " + smartTv.volume);

        System.out.println( "---------------------------------------------------------");

            System.out.println("Canal atual : " + smartTv.canal);

            smartTv.aumentarCanal();

            System.out.println("Canal atual : " + smartTv.canal);
        
        System.out.println( "---------------------------------------------------------");

        smartTv.mudarCanal(5);
        
        System.out.println("O canal escolhido agora é o " + smartTv.canal + " !!!");

    }
    

}