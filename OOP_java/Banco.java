package OOP;

import java.util.Arrays;
import java.util.List;

public class Banco {
    private String nome;
    List<Conta> contas = Arrays.asList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
