package GitHub;

import java.text.SimpleDateFormat;
import java.util.*;

public class Cinema {
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    Date hora = Calendar.getInstance().getTime();
    String horario = sdf.format(hora);
    String sessao = sdf.format(hora);
    String acaba = sdf.format(hora);

    Scanner scan = new Scanner(System.in);
    List<String> filmes = new ArrayList<>();
    int count = 0;
    public void addFilme(){
        System.out.print("Insira o nome do filme que deseja adicionar: ");filmes.add(count, scan.next());
        count++;
        System.out.println(filmes);
    }

    public void remFilme(){
        System.out.print("Insira o nome do filme que deseja remover: ");String nome = scan.next();
        System.out.print("Tem certeza? Digite S para sim e N para não: ");String resp = scan.next();
        resp.toUpperCase();
        if(resp.startsWith("S")){
            filmes.remove(nome);
            System.out.println(filmes);
        }
        else{
            System.out.println("O filme foi mantido." + filmes);
        }
    }
    public void duração(){

        System.out.print("Qual a duração do filme?");horario = scan.next();
        String[] horamin = horario.split(":");
        int hora = Integer.parseInt(horamin[0]);
        int min = Integer.parseInt(horamin[1]);
        int horas = (min / 60) + hora;
        System.out.println(horario);
    }

//    public void fim(){
//        System.out.println("Qual o horário da sessão?");sessao = scan.next();
//        String[] horamin =sessao.split(":");
//        int hora = Integer.parseInt(horamin[0]);
//        int min = Integer.parseInt(horamin[1]);
//        int mins = (hora * 60) + min;
//        int finaliza = mins + horas;
//
//        System.out.println("A sessão acaba às: " + acaba);
    }










