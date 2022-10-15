package exerciciosCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciciosPropostos02Collections {
    public static void main(String[] args) {
        System.out.println("Responda as perguntas e saiba se é suspeito do crime.");
        Scanner sc = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Perguntas: ");

        System.out.print("\nTelefonou para vítima? ");
        String resposta1 = sc.next();
        respostas.add(resposta1.toLowerCase());

        System.out.print("\nEsteve no local do crime? ");
        String resposta2 = sc.next();
        respostas.add(resposta2.toLowerCase());

        System.out.print("\nMora perto da vitima? ");
        String resposta3 = sc.next();
        respostas.add(resposta3.toLowerCase());

        System.out.print("\nDevia para a vitima? ");
        String resposta4 = sc.next();
        respostas.add(resposta4.toLowerCase());

        System.out.print("\nJá trabalhou com a vitima? ");
        String resposta5 = sc.next();
        respostas.add(resposta5.toLowerCase());
        sc.close();

        System.out.println(respostas);

        int contador = 0;

        for (String resp : respostas) {
            if (resp.contains("s")) {
                contador++;
            }
        }

        switch (contador) {
            case 2 -> System.out.println(">> SUSPEITA <<");
            case 3, 4 -> System.out.println(">> CÚMPLICE <<");
            case 5 -> System.out.println(">> ASSASSINO <<");
            default -> System.out.println(">> INOCENTE <<");
        }
    }
}
