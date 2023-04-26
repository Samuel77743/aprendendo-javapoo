package exerciciopoo010;

public class StaticTestar {
    public static void main(String[] args) {
        
       
        int id = 0;

        AprendStatic jog1 = new AprendStatic(++id);
        AprendStatic jog2 = new AprendStatic(++id);
        

        //Atribuindo nome e vidas ao Jogador 1
        jog1.setPlayer("Cole McGrath");
        System.out.printf("\n\nNome --> %s\n", jog1.getPlayer());

        jog1.setVidas(4);
        System.out.printf("Vidas --> %d\n", jog1.getVidas());
        System.out.printf("Resposta --> %s", AprendStatic.alerta ? "Verdadeiro" : "Falso");
        
        //Atribuindo nome e vidas ao Jogador 2
        jog2.setPlayer("Arthur Morgan");
        System.out.printf("\n\nNome --> %s\n", jog2.getPlayer());

        jog2.setVidas(8); //Mudará de 8 pra 7 automaticamente pela condição
        System.out.printf("Vidas --> %d\n", jog2.getVidas());
        System.out.printf("Resposta --> %s\n\n", AprendStatic.alerta ? "Verdadeiro" : "Falso");

        //Usando método info() e mudando valor do atributo Static(alerta)
       
        AprendStatic.alerta = false; //Todos objetos terão alerta falso

        System.out.println("---USANDO MÉTODO INFO---");
        jog1.info();            //Info do jog1
        System.out.println();
        jog2.info();            //Info do jog2
        
    }
}
