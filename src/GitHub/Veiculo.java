package GitHub;

import java.util.Scanner;
public class Veiculo {
    Scanner scan = new Scanner(System.in);
    final int VALOR_GASOLINA = 7;

    public double getLitrosTanque() {
        return litrosTanque;
    }

    public void setLitrosTanque(double litrosTanque) {
        this.litrosTanque = litrosTanque;
    }
    private double litrosTanque;

    public void abastecer(){
        System.out.print("Quantos litros deseja abastecer? ");double litros = scan.nextDouble();
        if(litros > litrosTanque){
            System.out.println("Valor excede o máximo! " + litrosTanque + "L abastecidos e " + (litros - litrosTanque) + "L excedentes.");
            System.out.println(litros);
            System.out.println("Foram gastos: " + (VALOR_GASOLINA * litros));
        }
        if(litros < litrosTanque){
            System.out.println(litros + "L abastecidos.");
            System.out.println(litros);
            System.out.println("Foram gastos: " + (VALOR_GASOLINA * litros));
        }
    }

}
