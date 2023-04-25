package exerciciopoo002;

public class Carro {

    //Atributos
    public String nome;
    public String marca;
    public int ano;
    public int velocidade;

    //Métodos
    public Carro (){

    }

    void acelerar (int aceleracao) {
        velocidade += aceleracao; 
    }

    void frear (int reduzir) {
        velocidade -= reduzir;
    }

    void buzinar () {
        System.out.println("Bibiii Bibiii Bibiii");
    }
}

