package petshop;

public class GerenciadorPetshop {
    public static void main(String[] args) {
        // Criando animais
        Cachorro dog = new Cachorro("Rex", "Labrador", 5, "Carlos", "grande");
        Gato cat = new Gato("Mimi", "Persa", 3, "Ana", "azuis");
        OutroAnimal coelho = new OutroAnimal("Bunny", "Mini Rex", 2, "Lucas", "coelho");

        // Criando serviços
        Banho banho = new Banho(30);
        Tosa tosa = new Tosa(40);
        ConsultaVeterinaria consulta = new ConsultaVeterinaria(100);

        // Exibindo preços
        System.out.println(dog);
        System.out.println("Preço banho: R$ " + banho.calcularPreco(dog));
        System.out.println("Preço tosa: R$ " + tosa.calcularPreco(dog));
        System.out.println("Preço consulta: R$ " + consulta.calcularPreco(dog));

        System.out.println();

        System.out.println(cat);
        System.out.println("Preço banho: R$ " + banho.calcularPreco(cat));
        System.out.println("Preço tosa: R$ " + tosa.calcularPreco(cat));
        System.out.println("Preço consulta: R$ " + consulta.calcularPreco(cat));

        System.out.println();

        System.out.println(coelho);
        System.out.println("Preço banho: R$ " + banho.calcularPreco(coelho));
        System.out.println("Preço tosa: R$ " + tosa.calcularPreco(coelho));
        System.out.println("Preço consulta: R$ " + consulta.calcularPreco(coelho));

        // Comparações
        Cachorro dog2 = new Cachorro("Rex", "Labrador", 5, "Carlos", "grande");
        System.out.println("\nDog equals Dog2? " + dog.equals(dog2));
        System.out.println("HashCode Dog: " + dog.hashCode() + " | Dog2: " + dog2.hashCode());
    }
}
