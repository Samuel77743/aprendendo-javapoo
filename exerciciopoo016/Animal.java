package exerciciopoo016;

public class Animal implements SerVivo {

    private boolean vivo;

    public Animal(){ //Método Construtor
    }

    public void respirar(){ //Implementações exigidas pela Interface(SerVivo)

    }
    public void comer(int caloria){ //Implementações exigidas pela Interface(SerVivo)

    }
    public void beber(){ //Implementações exigidas pela Interface(SerVivo)

    }
    
    public void info() {
        System.out.printf("Situação --> %s\n\n", this.vivo ? "Vivo" : "Morto");
    }
    
}
