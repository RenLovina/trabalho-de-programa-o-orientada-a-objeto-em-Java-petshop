package petshop;

import java.util.Objects;

public abstract class Servico {
    protected String nome;
    protected double precoBase;

    public Servico(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPreco(Animal animal);

    @Override
    public String toString() {
        return "Servico{" + "nome='" + nome + "', precoBase=" + precoBase + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Servico)) return false;
        Servico servico = (Servico) o;
        return Double.compare(precoBase, servico.precoBase) == 0 && Objects.equals(nome, servico.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, precoBase);
    }
}

