package psoft.atv2;

public class Produto {

    private final String nome;
    private final Time time;

    public Produto(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public Time getTime() {
        return time;
    }
}