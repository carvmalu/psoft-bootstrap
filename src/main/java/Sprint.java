package psoft.atv2;

public class Sprint {

    private final int numero;
    private final Funcionario lider;
    private Funcao funcaoLider;

    public Sprint(int numero, Funcionario lider) {
        this.numero = numero;
        this.lider = lider;
    }

    public int getNumero() {
        return numero;
    }

    public Funcionario getLider() {
        return lider;
    }

    public void iniciar() {
        if (funcaoLider != null) {
            throw new IllegalStateException("Sprint " + numero + " já foi iniciada");
        }
        funcaoLider = new Lider();
        lider.adicionarFuncao(funcaoLider);
    }

    public void encerrar() {
        if (funcaoLider == null) {
            throw new IllegalStateException("Sprint " + numero + " não está em andamento");
        }
        lider.removerFuncao(funcaoLider);
        funcaoLider = null;
    }
}