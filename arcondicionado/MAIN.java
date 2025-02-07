package POO.exercicios.GETTERSANDSETTRES.arcondicionado;

import java.util.Scanner;

public class MAIN {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        arcondicionado ar=new arcondicionado();
        int opção=0;
        int temp=0;
        do{
            System.out.println("digite 1 para ligar o ar-condicionado");
            System.out.println("digite 2 para desligar o ar-condicionado");
            System.out.println("digite 0 para sair");
            opção= scanner.nextInt();
            System.out.println("----------------------------------------------------------");
            if(opção>2 || opção<0){
                System.out.println("escolha invalida!.....");
                System.out.println("----------------------------------------------------------");

            } else if (opção==1) {
                do {
                    ar.ligar();
                    System.out.println("digite 3 para aumentar a temperatura");
                    System.out.println("digite 4 para diminuir a temperatura");
                    System.out.println("digite 2 para desligar o ar-condicionado");
                    temp = scanner.nextInt();
                    if (temp > 4 || temp < 2) {
                        System.out.println("opção invalida.....");
                    } else if (temp == 3) {
                        ar.aumentarTemperatura();
                        ar.exibirStatus();

                    } else if (temp == 4) {
                        ar.diminuirTemperatura();
                        ar.exibirStatus();

                    } else if (temp == 2) {
                        ar.desligar();
                        ar.exibirStatus();
                        break;
                    }
                }while(temp!=2);

            }else if(opção==2){
                ar.desligar();
                ar.exibirStatus();
            }

        }while(opção!=0);



    }
}
