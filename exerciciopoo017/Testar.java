package exerciciopoo017;

public class Testar {
    public static void main(String[] args) {

        
        //AtletaAbstract n1 = new Abstrata();
       //--> Não daria certo pois CLASSE ABSTRATA CONSEGUE
        //DAR DE HERANÇA SUAS PROPRIEDADES, mas não pode um objeto ser instanciado por ela

        Atleta pessoa1 = new Atleta();
        pessoa1.Correr();
        pessoa1.Descansar();
        pessoa1.Treinar();
        //A classe Atleta tem de herança os atributos e metodos de AtletaAbstract,
        //permitindo que propriedades dela sejam utilizadas indiretamente

     }
}
