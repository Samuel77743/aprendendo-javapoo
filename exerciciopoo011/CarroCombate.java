package exerciciopoo011;

public class CarroCombate extends Carro {
    
    private final int MAX_ARMAMENTO = 100;
    private final int MIN_ARMAMENTO = 0;
    private int qntArmamento;

    public CarroCombate(String nome, int blindagem){
        super(nome);
        super.setArmamento(true);
        super.setBlindagem(blindagem);
        this.qntArmamento = 100;
    }

    public void setQntArmamento(int qntArmamento) {
        
        if (qntArmamento > MAX_ARMAMENTO) {
            this.qntArmamento = MAX_ARMAMENTO;
        }
        else if(qntArmamento < MIN_ARMAMENTO) {
            this.qntArmamento = MIN_ARMAMENTO;
        }
        else {
            this.qntArmamento = qntArmamento;
        }
    }

    public int getQntArmamento() {
        return this.qntArmamento;
    }

    public void atirar() {
        if(qntArmamento > MIN_ARMAMENTO) {
            qntArmamento--;
        }
        else {
            System.out.printf("\n\t___/ MUNIÇÃO ACABOU (%s) \\___", this.nome);
        }
    }

    public void infoCombate() {
        super.info();
        System.out.printf("QUANTIDADE DE ARMAMENTO....... %d%%\n", this.qntArmamento);
    }
}