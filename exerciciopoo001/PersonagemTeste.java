package exerciciopoo001;
public class PersonagemTeste {
    public static void main(String[] args) {
        
        int id = 0;

        Personagem personagem1 = new Personagem(++id, "Heroi"); //Pré-incremento
        Personagem personagem2 = new Personagem(++id, "Guerreiro");
        Personagem personagem3 = new Personagem(++id, "Vilão");

        System.out.println("ID do 1º Personagem --> " + personagem1.id);
        System.out.println("Classe do 1º Personagem --> " + personagem1.classe);
        System.out.println("Vidas do 1º Personagem --> " + personagem1.vida);

        System.out.println("\nID do 2º Personagem --> " + personagem2.id);
        System.out.println("Classe do 2º Personagem --> " + personagem2.classe);
        System.out.println("Vidas do 2º Personagem --> " + personagem2.vida);

        System.out.println("\nID do 3º Personagem --> " + personagem3.id);
        System.out.println("Classe do 3º Personagem --> " + personagem3.classe);
        System.out.println("Vidas do 3º Personagem --> " + personagem3.vida);
    }
}