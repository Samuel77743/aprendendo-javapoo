package exerciciopoo018;

public class Aranha extends Animal {
    //Atributos
    private int veneno;


    public Aranha(int massa, int vel, int forca, int veneno) {
        super(massa, vel, forca);
        this.veneno = veneno;
    }

    @Override
    public void atacar (Animal atacado) {
        if(atacado.getVivo()) {

            if((this.getForca() + this.veneno) >= atacado.getForca()) {
                this.setForca(this.getForca() + atacado.getMassa()); 
                atacado.setVivo(false);
            }
            else {
                atacado.setForca(atacado.getForca() + this.getMassa());
                this.setVivo(false);
            }
        }
        else {
            System.out.println("===================================");
            System.out.println(atacado.getClass().toGenericString() + "está morto e não pode atacar");
            System.out.println("===================================");
        }

    }
}
