package petshop;

import java.util.Objects;

public class Gato extends Animal {
    private String corOlhos;

    public Gato(String nome, String racaTipo, int idade, String proprietario, String corOlhos) {
        super(nome, racaTipo, idade, proprietario);
        this.corOlhos = corOlhos;
    }

    @Override
    public String toString() {
        return "Gato{" + super.toString() + ", corOlhos='" + corOlhos + "'}";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && o instanceof Gato && Objects.equals(corOlhos, ((Gato) o).corOlhos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), corOlhos);
    }
}
