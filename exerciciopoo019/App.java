package exerciciopoo019;

public class App {
    public static void main(String[] args) {
        
        //Arrays de Objetos de uma classe
        //Declarando um array com 5 objetos da classe Carro:
        Carro[] meuCarros = new Carro[5];

        //Instanciando objetos e Atribuindo valores do Contrutor
        meuCarros[0] = new Carro("Camaro");
        meuCarros[1] = new Carro("Ferrari");
        meuCarros[2] = new Carro("Uno");
        meuCarros[3] = new Carro("Fusca");
        meuCarros[4] = new Carro("Gol");

        //Printando a info de todos veículos do Array:
        for(Carro i : meuCarros) {
            System.out.println(i + "\n");
        }
        // (Como há um método "toString" na classe carro basta o nome do objeto para
        // ... invocar o procedimento)
    }
}
