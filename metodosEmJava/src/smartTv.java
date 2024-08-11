
// classe smartTv
    // classes e metodos : 
    // statusTv (ON/OFF) tipo : boolean /  nome do metodo : ligarEdesligar
    // botaoVolume (+/-) tipo : int /  nome do metodo : aumentarEdiminuir (+1 ou -1)
    // canaisDaTv (+/-) tipo : int /  nome do metodo : mudarCanal (de 1 em 1 ou número correspondente)



public class smartTv {

    boolean ligada = false;
    
    int canal = 1;
    int volume = 25;

    public void ligar (){

        ligada = true;
    }
    public void desligar (){

        ligada = false;
    } 

    public void aumentarVolume(){

        volume++;
    }
    public void diminuirVolume(){

        volume--;
    }

    public void mudarCanal (int novoCanal){

        canal = novoCanal;
    }

    public void aumentarCanal(){

        canal++;
    }

    public void diminuirCanal(){

        canal--;
    }
}

