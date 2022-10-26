package exerciciosCollections;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExerciciosPropostos01Set {
/*
Crie um conjunto contendo as cores do arco-iris e:
 * A - Exiba todas as cores uma abaixo da outra
 * B - A quantidade de cores que o arco-iris tem
 * C - Exiba as cores na ordem alfabética
 * D - Exiba as cores na ordem inversa da que foi informadas
 * E - Exiba todas as cores que começam com a letra "V"
 * F - Remova todas as cores que não começam com a letra "V"
 * G - Limpe o conjunto
 * H - Confira se o conjunto está vazio
 vermelha, laranja, amarela, verde, azul, azul-escuro e violeta.
 */
    public static void main (String[] args) {

        List<ArcoIris> coresArcoIris = new ArrayList<ArcoIris>(){{
            add(new ArcoIris("vermelho"));
            add(new ArcoIris("laranja"));
            add(new ArcoIris("amarela"));
            add(new ArcoIris("verde"));
            add(new ArcoIris("azul"));
            add(new ArcoIris("anil"));
            add(new ArcoIris("violeta"));
        }};

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (ArcoIris cor : coresArcoIris) {
            System.out.println(cor);
        }
        System.out.println("");

        System.out.println("A quantidade de cores que o arco-íris tem: " + coresArcoIris.size());
        System.out.println("");

        System.out.println("Exiba as cores em ordem alfabética: ");

        






    }

}

class ArcoIris implements Comparable<ArcoIris>{

    private String cores;

    public ArcoIris(String cores) {
        this.cores = cores;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "ArcoIris{" +
                "cores='" + cores + '\'' +
                '}';
    }
    @Override
    public int compareTo(ArcoIris o) {
        return 0;
    }
}

