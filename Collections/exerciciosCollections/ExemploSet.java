package exerciciosCollections;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
//        Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:
//      Set notas = new HashSet<>(); //antes do java 5
//        HashSet<Double> notas = new HashSet<>();
//        Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//        notas.add(1d);
//        notas.remove(5d);
//        System.out.println(notas);
// --------------------------------------------------------------------------------------------------

//        System.out.println("Crie um conjunto e adicione as notas: ");
//        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.8, 9.3, 5d, 7d, 0d, 3.6));
//        System.out.println(notas.toString());

//        System.out.println("Exiba a posição da nota 5.0: "+ );
//        System.out.println("Adicione na çista a nota 8.0 na posição 4: ");
//        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
//        System.out.println("Confira se a nota 5.0 está no conjunto: "+ notas.contains(5d));
//        System.out.println("Exiba a terceira nota adicionada: ");
//        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
//        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

//        Iterator<Double> iterator = notas.iterator();
//        Double soma = 0.0;
//        while (iterator.hasNext()) {
//            Double next = iterator.next();
//            soma += next;
//        }
//        System.out.println("Exiba a soma dos valores: "+ soma);
//
//        System.out.println("Exiba a media das notas: "+ (soma / notas.size()));
//
//        System.out.println("Remova a nota 0: ");
//        notas.remove(0d);
//        System.out.println(notas);

//        System.out.println("Remova a nota da posição 0: ");
//
//        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
//        Iterator<Double> iterator1 = notas.iterator();
//        while(iterator1.hasNext()) {
//           Double next = iterator1.next();
//           if (next <  7) iterator1.remove();
//        }
//        System.out.println(notas);
//
//        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
//        Set<Double> notas2 = new LinkedHashSet<>();
//        notas2.add(7d);
//        notas2.add(8.5);
//        notas2.add(9.3);
//        notas2.add(5d);
//        notas2.add(7d);
//        notas2.add(0d);
//        notas2.add(3.6);
//        System.out.println(notas2);
//
//        System.out.println("Exiba todas as notas na ordem crescente: ");
//        Set<Double> notas3 = new TreeSet<>(notas2);
//        System.out.println(notas3);
//
//        System.out.println("Apague todo o conjunto: ");
//        notas.clear();
//        System.out.println(notas);
//
//        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
//
//        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
//        System.out.println(notas2);
//
//        System.out.println("Confira se o conjunto 3 está vazio: " + notas2.isEmpty());
//        System.out.println(notas3);
//--------------------------------------------------------------------------------------------------
/*
    Dada as seguintes informações sobre minhas series favoritas, crie um conjunto e
     ordene este conjunto e ordene este conjunto exibido:
    (nome - genero - tempo de episodio);
    Serie 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
    Serie 2 = Nome: dark, genero: drama, tempoEpisodio: 60
    Serie 3 = Nome: st, genero: ficçãoCientifica, tempoEpisodio: 60
*/

        System.out.println("--\tOrdem aleatoria\t--");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("stranger things", "ficçãoCientifica", 25));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("stranger things", "ficçãoCientifica", 25));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


//        System.out.println(minhasSeries2);

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);

        for (Serie serie : minhasSeries3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Gênero\t--");
        System.out.println("--\tOrdem TempoEpisodio\t--");


    }
}


class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie serie)) return false;
        return Objects.equals(getNome(), serie.getNome()) && Objects.equals(getGenero(), serie.getGenero()) && Objects.equals(getTempoEpisodio(), serie.getTempoEpisodio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getGenero(), getTempoEpisodio());
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());

    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;


        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}