package exerciciosCollections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*Dadas as seguintes informações sobre meus gatos, crie uma lista
 *e ordene esta lista exibindo: (nome - idade - cor);
 * Gato1 = nome: Jon, idade: 18, cor:Preto
 * Gato2 = nome: Simba, idade: 6, cor: Tigrado
 * Gato3 = nome: Jon, idade: 12, cor: Amarelo
 */
public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<Gato>(){{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};

        System.out.println(meusGatos);
        System.out.println("");

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);
        System.out.println("");

        System.out.println("--\tOrdem Aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println("");

        System.out.println("--\tOrdem Natural\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
    }
}
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}