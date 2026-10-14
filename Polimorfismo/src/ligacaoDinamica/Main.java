package ligacaoDinamica;

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal1 = new Animal();
        meuAnimal1.emitirSom();

        Animal meuAnimal2 = new Cachorro();
        meuAnimal2.emitirSom();

        Animal meuAnimal3 = new Gato();
        meuAnimal3.emitirSom();
    }
}
