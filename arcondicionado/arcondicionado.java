package POO.exercicios.GETTERSANDSETTRES.arcondicionado;

public class arcondicionado {

    private int temperatura;
    private boolean ligado;


    public arcondicionado(){
        this.temperatura=24;
        this.ligado=false;
    }


    public boolean ligar(){
        ligado=true;
        return ligado;
    }
    public boolean desligar(){
        if(!ligado){

            return ligado;
        }else{
            ligado=false;
            return  ligado;
        }
    }

    public int aumentarTemperatura(){

        if(temperatura>=30){
            System.out.println("o maximo permitido é 30 graus, você está excedendo o limite");
            return temperatura-1;
        }else {
            temperatura+=1;
            return temperatura;
        }
    }
    public int diminuirTemperatura(){

        if(temperatura<=16){
            System.out.println("o minimo permitido é 16 graus, você está excedendo o limite");
            return temperatura+1;
        }else {
            temperatura-=1;
            return temperatura;

        }

    }
    public void exibirStatus(){
        System.out.println("temperatura atual: "+temperatura+" graus");
        if (ligado){
            System.out.println("status do ar-condicionado:LIGADO");
        }else{
            System.out.println("status do ar-condicionado:DESLIGADO");
        }
        System.out.println("-----------------------------------------------------");


    }
}
