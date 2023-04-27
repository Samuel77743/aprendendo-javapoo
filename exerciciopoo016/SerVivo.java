package exerciciopoo016;

public interface SerVivo {
    
    //Atributos da interface mesmo públicos não permitem modificação
    //public boolean vivo = true;


    // Métodos da interface deverão ser implementandos na classe implementada respeitando tipo 
    // de parâmetro definido aqui

    public void respirar();
    public void comer(int caloria);
    public void beber();
    public void info();
}
