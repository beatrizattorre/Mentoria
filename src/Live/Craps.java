package Live;
//Faça um programa que implemente um jogo de Live.Craps. O jogador lança um par de dados,
// obtendo um valor entre 2 e 12.
//a) Se, na primeira jogada, você tirar 7 ou 11, você é um "Natural" e ganha;
//b) Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "Live.Craps" e você perdeu;
//c) Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10, este é seu "Ponto";
//d) Seu objetivo agora é continuar jogando os dados até tirar este número novamente;
//e) Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente;

import java.util.Random;

public class Craps {
    public static void main(String[] args) {
        Random random = new Random();
        int dados1 = random.nextInt(2, 12);
        System.out.println("Dados: " + dados1);
        if (dados1 == 7 || dados1 == 11) {
            System.out.println("Natural! Você ganhou!");
        }
        if (dados1 == 2 || dados1 == 3 || dados1 == 12) {
            System.out.println("Live.Craps! Você perdeu!");
        } else {
            System.out.println("Ponto! Jogue os dados até tirar este número novamente, caso tire 7, você perde.");
            int dados2;
            do{
                dados2 = random.nextInt(2, 12);
                System.out.println("Dados: " + dados2);
                if(dados2 == 7){
                    System.out.println("Você tirou " + dados2 + "e por isso perdeu.");
                }
                if(dados2 == dados1){
                    System.out.println("Você tirou " + dados2 + " de novo! E por isso ganhou!");
                }
            }while(dados2 != dados1 && dados2 != 7);
        }
    }
}
