package psoft.atv2;

public class ProductOwner implements Funcao {

    @Override
    public String getNome() {
        return "Product Owner";
    }

    @Override
    public void exercer() {
        System.out.println("  supervisionando os produtos da empresa");
    }
}