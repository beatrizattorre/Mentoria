package GitHub;
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int pares = 0;
        do{
            System.out.print("Insira um inteiro de 4 dígitos: ");num = scan.nextInt();
        }while(num < 1000 || num > 9999);
        if(num > 1000 && num < 9999){
            int milhar = num / 1000;
            int centena = (num / 100) - (milhar * 10);
            int dezena = (num / 10) - ((milhar * 100) + (centena * 10));
            int unidade = num - ((milhar * 1000) + (centena * 100) + (dezena * 10));
            if(milhar % 2 == 0){
                pares++;
            }
            if(centena % 2 == 0){
                pares++;
            }
            if(dezena % 2 == 0){
                pares++;
            }
            if(unidade % 2 == 0){
                pares++;
            }
            System.out.println("Quantidade de algarismos pares: " + pares);
        }
    }
}
