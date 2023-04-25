package exerciciopoo008;

public class Jogos {
    private int idJogo;
    private String nomeJogo;
    private float preco;
    
    public  Jogos(int idJogo, String nomeJogo, float preco) {
        this.idJogo = idJogo;
        this.nomeJogo = nomeJogo;
        this.preco = preco;
    }

    public void setAll(int idJogo, String nomeJogo, float preco ) {
        this.idJogo = idJogo;
        this.nomeJogo = nomeJogo;
        this.preco = preco;
    }

    public String getAll() {
        return ("ID #"+idJogo+"\nNome: "+nomeJogo+"\nPreço: "+preco);
    }

    public String getNome() {
        return nomeJogo;
    }

    public void setNome(String nomeJogo){
        this.nomeJogo = nomeJogo;
    }

    public float getPreco(){
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
