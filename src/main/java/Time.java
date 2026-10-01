package psoft.atv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Time {

    private final String nome;
    private final Funcionario gerente;
    private final List<Funcionario> desenvolvedores = new ArrayList<>();
    private final List<Sprint> sprints = new ArrayList<>();

    public Time(String nome, Funcionario gerente) {
        if (!gerente.possui(Gerente.class)) {
            throw new IllegalArgumentException(gerente.getNome() + " não é gerente");
        }
        this.nome = nome;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public List<Funcionario> getDesenvolvedores() {
        return Collections.unmodifiableList(desenvolvedores);
    }

    public void adicionarDesenvolvedor(Funcionario dev) {
        if (!dev.possui(Desenvolvedor.class)) {
            throw new IllegalArgumentException(dev.getNome() + " não é desenvolvedor");
        }
        desenvolvedores.add(dev);
    }

    public Sprint criarSprint(Funcionario lider) {
        if (!desenvolvedores.contains(lider)) {
            throw new IllegalArgumentException(lider.getNome() + " não é desenvolvedor deste time");
        }
        if (!sprints.isEmpty() && sprints.get(sprints.size() - 1).getLider().equals(lider)) {
            throw new IllegalArgumentException("O líder deve ser diferente do líder da Sprint anterior");
        }
        Sprint sprint = new Sprint(sprints.size() + 1, lider);
        sprints.add(sprint);
        return sprint;
    }
}