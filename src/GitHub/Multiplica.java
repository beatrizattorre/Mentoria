package GitHub;
//Crie um programa cujo usuário digite um número(multiplicando), o início e o fim de um intervalo(multiplicadores).
//Calcule o resultado(produto) das multiplicações entre o multiplicando e os multiplicadores que estão entre
//o intervalo e exiba a operação realizada: “multiplicando x multiplicador = produto”.
//Exemplo: Multiplicando (Intervalo/Resto)

import java.util.Scanner;

public class Multiplica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Multiplicando: ");double num = scan.nextDouble();
        System.out.print("Primeiro multiplicador: ");int lim1 = scan.nextInt();
        System.out.print("Segundo multiplicador: ");int lim2 = scan.nextInt();
        if((lim2 - lim1) > 10 || lim1 > lim2 || num < 0 || num > 5000 || lim1 < 0 || lim1 > 5000 || lim2 < 0 || lim2 > 5000){
            System.out.println("Inválido!");
        }else{
            System.out.println("Válido!");
            System.out.println(num + "x" + lim1 + " = " + num * lim1);
            System.out.println(num + "x" + lim2 + " = " + num * lim2);
        }


    }
}
