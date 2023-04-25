package exerciciopoo007;

public class ComputadorTeste {
    public static void main(String[] args) {
        Computador comp1 = new Computador();

        //SET -> Atribuir valores
        //comp1.marca = "DELL"; (não possível por causa dos modificadores de acesso private)
        comp1.setMarca("DELL"); //Maneira correta

        //GET -> Obter valores
        //System.out.print(comp1.marca); (não possível por modificadores de acesso private)
        System.out.println(comp1.getMarca()); //Maneira correta
    }
    
}
