package exerciciopoo013;

import exerciciopoo013.veiculos.Veiculos; //importando Super Classe

public class Moto extends Veiculos {
    private int velMax;

    public Moto(int velMax) {
        super("Yamaha");
        this.preco = 13400.99f; //Consigo acessar atributo da prop. Protected pois é herança
        this.velMax = velMax;
    }

    public void info() {
        super.info();
        System.out.printf("VELOCIDADE MÁXIMA.... %d", this.velMax);
    }
}
    