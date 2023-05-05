package exerciciopoo020;

public class App {
    public static void main(String[] args) {
        
        //Declarando array de 5 posições com objetos de classe Carro
        Carro[] meuCarros = new Carro[5];

        //Declarando o que virá a ser nomes para esses carros
        String[] nomesCarros = {"Palio", "Mobi", "Polo", "Civic", "Brasília"};
        
        //Atribuindo noms para cada objeto do array meuCarros
        for(int i = 0; i < meuCarros.length; i++) {
            meuCarros[i] = new Carro(nomesCarros[i]);    
        }

        //Imprimindo informação dos veículos nomeados:
        for(Carro i : meuCarros) {
            System.out.println(i + "\n");
        }



    }
}
