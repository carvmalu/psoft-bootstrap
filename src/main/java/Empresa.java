package psoft.atv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Empresa {

    private final String nome;
    private final Funcionario productOwner;
    private final List<Produto> produtos = new ArrayList<>();

    public Empresa(String nome, Funcionario productOwner) {
        if (!productOwner.possui(ProductOwner.class)) {
            throw new IllegalArgumentException(productOwner.getNome() + " não é Product Owner");
        }
        this.nome = nome;
        this.productOwner = productOwner;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario getProductOwner() {
        return productOwner;
    }

    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(produtos);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
}