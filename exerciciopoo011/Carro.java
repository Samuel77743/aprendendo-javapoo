package exerciciopoo011;

public class Carro {
    //SE TRATA DO ESTADO DE UM CARRO

    String nome;
    int blindagem = 1; //Blindagem Inicial de carro comum
    boolean destruicao;
    boolean ligado = true;
    boolean armamento;    

    public Carro(String nome){
        this.nome = nome;

    }

    public String getNome(){
        return this.nome;
    }

    public int getBlindagem(){
        return this.blindagem;
    }

    public void setBlindagem(int blindagem) {
        if(blindagem > 100) {
            this.blindagem = 100;
        }
        else if(blindagem < 0) {
            this.blindagem = 1;
        }
        else {
        this.blindagem = blindagem;
        }
    }

    public boolean getDestruicao(){
    return this.destruicao;            
    }

    public boolean getLigado(){
    return this.ligado;        
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getArmamento(){
    return this.armamento;        
    }

    public void setArmamento(boolean armamento) {
        this.armamento = armamento;
    }

    public void sofrerDano(int dano){
        this.blindagem -= dano;

        if(this.blindagem <= 0){
            this.blindagem = 0;
            this.ligado = false;
            this.destruicao = true;
        }
    }

    public void info(){
        System.out.println("\n------------------------------------------------");

        System.out.printf("NOME.......................... %s\n", this.nome);
        System.out.printf("LIGADO OU DESLIGADO........... %s\n", this.ligado ? "Ligado" : "Desligado");
        System.out.printf("ESTADO DE DESTRUIÇÃO.......... %s\n", this.destruicao ? "Veículo Destruído" : "O veículo NÃO está destruído");
        System.out.printf("BLINDAGEM..................... %d%%\n", this.blindagem);
        System.out.printf("POSSUI ARMAMENTO.............. %s\n", this.armamento ? "SIM" : "NÃO");
    }
}
