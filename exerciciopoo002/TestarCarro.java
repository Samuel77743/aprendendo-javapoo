package exerciciopoo002;

public class TestarCarro {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        
        c1.nome = "Fuscão Preto";
        c1.marca = "Volkswagen";
        c1.ano = 1972;
        c1.velocidade = 100;

        System.out.println("Velocidade inicial --> " + c1.velocidade);

        c1.acelerar(30);
        System.out.println("Velocidade após acelerar --> " + c1.velocidade + " Km/h");

        c1.frear(20);
        System.out.println("Velocidade após reduzir --> " + c1.velocidade + " Km/h");


    }
}
