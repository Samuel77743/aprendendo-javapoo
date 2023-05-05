package exerciciopoo020;

public class Carro {
    private String nome;
    private boolean ligado;
    private boolean destruido;
    private int blindagem;
    private boolean armamento;

    //MÉTODO CONSTRUTOR:
    public Carro(String nome) {
        this.nome = nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 1;
        this.armamento = false;
    }

    //GETs e SETs:
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getLigado() {
        return this.ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getDestruido() {
        return this.destruido;
    }
    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    public int getBlindagem() {
        return this.blindagem;
    }
    public void setBlindagem(int blindagem) {
        this.blindagem = blindagem;
    }

    public boolean getArmamento() {
        return this.armamento;
    }
    public void setArmamento(boolean armamento) {
        this.armamento = armamento;
    }
    //////////////////////////
    
    //Ações:
    public void sofrerDano(int dano) {
        this.blindagem -= dano;
        if(this.blindagem < 0) {
            this.blindagem = 0;
            this.ligado = false;
            this.destruido = true;
        }
    }

    public String toString() {
        return
        "== INFORMAÇÕES DO VEÍCULO =="+
        "\nNOME.............. " + this.getNome() +
        "\nLIGADO............ " + (this.getLigado() ? "Ligado" : "Desligado") +
        "\nDESTRUÍDO......... " + (this.getDestruido() ? "Sim" : "Não") +
        "\nBLINDAGEM......... " + this.getBlindagem() +
        "\nARMAMENTO......... " + (this.getArmamento() ? "Possui" : "Não possui");
    }
    
}
