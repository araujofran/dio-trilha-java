public class usuario {
    public static void main(String[] args) throws Exception {
        
        smartTv smartTv = new smartTv();

       
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Volume atual : " + smartTv.volume);
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.ligar();

        System.out.println(" Novo Status: TV ligada ? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println(" Novo Status: TV ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo Volume atual : " + smartTv.volume);

        smartTv.trocarCAnal();

        System.out.println("Canal atual : " + smartTv.canal);

    }
    

}