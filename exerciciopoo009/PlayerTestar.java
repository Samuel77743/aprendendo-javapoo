package exerciciopoo009;

public class PlayerTestar {
    public static void main(String[] args) {
        int id = 0;
        Player jog1 = new Player(++id, "Ghost");
        
        System.out.println(jog1.getAll());

        //Qualquer valor excedendo > que MAXVIDAS(=7) será atribuido 7
        jog1.setVidas(15000);
        System.out.println("\n"+jog1.getAll());

        //Qualquer valor < que 0 será atribuido 0
        jog1.setVidas(-14);
        System.out.println("\n"+jog1.getAll());

        //Valores entre 0 e 7 serão atribuidos diretamente
        jog1.setVidas(5);
        System.out.println("\n"+jog1.getAll());

        //Supondo que um player adquiriu uma vida...
        jog1.addVidas();
        System.out.println("\n"+jog1.getAll());



    }
    
}
