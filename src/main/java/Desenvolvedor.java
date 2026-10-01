package psoft.atv2;

public class Desenvolvedor implements Funcao {

    @Override
    public String getNome() {
        return "Desenvolvedor";
    }

    @Override
    public void exercer() {
        System.out.println("  desenvolvendo o produto");
    }
}