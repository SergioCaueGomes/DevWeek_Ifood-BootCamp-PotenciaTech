package exerciciosCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciciosPropostos01Collections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quer verificar a temperatura media dos primeiros 6 meses do ano?");
        List<Double> temperaturas = new ArrayList<Double>();

        //Adicionando as temperaturas na lista:
        int contador = 0;
        while (contador != 6) {

            System.out.println("Insira a temperatura media por favor.");
            double temperatura = sc.nextDouble();
            temperaturas.add(temperatura);
            contador++;
        }
        System.out.println("");

        //exibindo temperaturas inseridas:
        System.out.print("Temperaturas inseridas: ");
        temperaturas.forEach(temp -> System.out.print(" "+ temp + " "));
        System.out.println("");

        //calculando e exibindo a média das temperaturas:
        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);
        System.out.println("");

        //exibindo as temperaturas acima da média
        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f ", t));
        System.out.println("");

        //exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        int count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0) -> System.out.printf("1 - janeiro: %.1f\n ", temp);
                    case (1) -> System.out.printf("2 - fevereiro: %.1f\n", temp);
                    case (2) -> System.out.printf("3 - março: %.1f\n", temp);
                    case (3) -> System.out.printf("4 - abril: %.1f\n", temp);
                    case (4) -> System.out.printf("5 - maio: %.1f\n", temp);
                    case (5) -> System.out.printf("6 - junho: %.1f\n", temp);
                    default -> System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }
        sc.close();

// Uma implementação de ordenação List
//
//        List<Temperaturas> temperaturasMeses = new ArrayList<Temperaturas>() {{
//            add(new Temperaturas("1 - Janeiro", 34));
//            add(new Temperaturas("2 - Fevereiro",32));
//            add(new Temperaturas("3 - Marco",31));
//            add(new Temperaturas("4 - Abril",29));
//            add(new Temperaturas("5 - Maio",26));
//            add(new Temperaturas("6 - Junho",22));
//        }};
//
//        System.out.println(temperaturasMeses);
//        System.out.println("");
//
//        Iterator<Temperaturas> iterator = temperaturasMeses.iterator();
//        Integer soma = 0;
//        while (iterator.hasNext()) {
//            Integer next = iterator.next().getTemperatura();
//            soma += next;
//        }
//        System.out.println("A média das temperaturas nos primeiros 6 meses do ano é de - "+ (soma/temperaturasMeses.size()) + "º, graus celsius");
//    }
//}
//
//class Temperaturas implements Comparable<Temperaturas>    {
//
//    private String mes;
//    private Integer temperatura;
//
//    public Temperaturas(String mes, Integer temperatura) {
//        this.mes = mes;
//        this.temperatura = temperatura;
//    }
//
//    public String getMes() {
//        return mes;
//    }
//
//    public Integer getTemperatura() {
//        return temperatura;
//    }
//
//    @Override
//    public String toString() {
//        return "Temperatura{" +
//                "mes='" + mes + '\'' +
//                ", temperatura=" + temperatura +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Temperaturas temp) {
//        return this.getTemperatura().compareTo(temp.getTemperatura());

    }

}






