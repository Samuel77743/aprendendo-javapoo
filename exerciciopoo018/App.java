package exerciciopoo018;

public class App {
        public static void main(String[] args) {

        //Animais
        Tigre animal1 = new Tigre(90, 40, 70);
        Sapo animal2 = new Sapo(8, 10, 15);
        Aranha animal3 = new Aranha(1, 2, 20, 40);

        //Vegetais
        Vegetal vegetal1 = new Vegetal(5);
        Vegetal vegetal2 = new Vegetal(15);
        
        //Informações iniciais da aranha
        animal3.info();
        //Aranha come 30 de massa e aumenta sua força em +30
        animal3.comer(30);
        //Informções atualizadas da aranha
        animal3.info();
        //Aranha ataca tigre
        animal3.atacar(animal1);
        //Aranha mata-o e absorve a massa dele como força
        animal3.info();
        //Tigre com info de situacao "morto"
        animal1.info();
    }
}