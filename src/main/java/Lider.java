package psoft.atv2;

public class Lider implements Funcao {

    @Override
    public String getNome() {
        return "Líder";
    }

    @Override
    public void exercer() {
        System.out.println("  liderando a equipe na Sprint");
    }
}