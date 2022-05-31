package Live;//Faça um programa que leia um valor inteiro (este número deverá conter 4 dígitos).
// A saída deverá ser o reverso de um número inteiro informado.
//Exemplo: Digamos que a entrada foi 3257. A resposta será 7523.

//a) A entrada deverá estar entre 1000 e 9999;

//b) Se o usuário digitar 3 dígitos ou menos, o Programa avisa que tem que conter 4 dígitos
//e continuar a programação até a resposta final.

import java.util.Scanner;

public class Reverso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        do{
            System.out.print("Insira um inteiro de 4 dígitos: ");num = scan.nextInt();
        }while(num < 1000 || num > 9999);

        String inverso = String.valueOf(num);
        StringBuilder stringBuilder = new StringBuilder(inverso);

        System.out.println("Live.Reverso: " + stringBuilder.reverse());
    }
}
