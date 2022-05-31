package Live;

import java.util.ArrayList;
import java.util.List;

public class Macaco {
//    Faça um programa e teste interativamente uma classe que modele um macaco com os atributos
//    “nome” e “bucho” (estômago) e os métodos “comer”, “verBucho” e “digerir”.
//    a) Crie 2 macacos;
//
//    b) Considere que a quantidade máxima de alimentos é 3. Com isso,
//    lembre-se de verificar o conteúdo do estômago a cada refeição (método “comer”).
//    Por fim, o método “digerir” deve esvaziar o bucho do Live.Macaco;
//
//    c) Alimentos “digeríveis” devem ser do tipo String, garanta isso em seu código
//    para que não haja nenhum Live.Macaco canibal 🙈.

    //atributos
    private String nome;
    private List<String> bucho = new ArrayList<>();

    //métodos
    public void comer(String comida){
        if(bucho.size() == 3){
            System.out.println("Bucho cheio! Digerir antes de comer novamente.");
        }else{
            bucho.add(comida);
        }
        System.out.println(bucho);
    }
    public void digerir(){
        bucho.remove(0);
        System.out.println(bucho);
    }
    public void verBucho(){
        System.out.println(bucho);
    }
}
