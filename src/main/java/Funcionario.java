package psoft.atv2;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Funcionario {

    private final String nome;
    private final Set<Funcao> funcoes = new LinkedHashSet<>();

    public Funcionario(String nome, Funcao funcaoInicial) {
        this.nome = nome;
        this.funcoes.add(funcaoInicial);
    }

    public String getNome() {
        return nome;
    }

    public Set<Funcao> getFuncoes() {
        return Collections.unmodifiableSet(funcoes);
    }

    public boolean possui(Class<? extends Funcao> tipo) {
        return funcoes.stream().anyMatch(tipo::isInstance);
    }

    public void adicionarFuncao(Funcao funcao) {
        if (possui(funcao.getClass())) {
            throw new IllegalStateException(nome + " já possui a função " + funcao.getNome());
        }
        funcoes.add(funcao);
    }

    public void removerFuncao(Funcao funcao) {
        funcoes.remove(funcao);
    }


    public void promover() {
        Funcao nova;
        if (possui(Desenvolvedor.class)) {
            nova = new Gerente();
        } else if (possui(Gerente.class)) {
            nova = new ProductOwner();
        } else {
            throw new IllegalStateException(nome + " não pode ser promovido");
        }
        funcoes.clear();
        funcoes.add(nova);
    }

    public void exercerFuncoes() {
        System.out.println(this);
        funcoes.forEach(Funcao::exercer);
    }

    @Override
    public String toString() {
        return nome + " [" + funcoes.stream().map(Funcao::getNome).collect(Collectors.joining(" + ")) + "]";
    }
}