package psoft.atv2;

public class Gerente implements Funcao {

    @Override
    public String getNome() {
        return "Gerente";
    }

    @Override
    public void exercer() {
        System.out.println("  gerenciando o time");
    }
}