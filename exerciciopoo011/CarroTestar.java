package exerciciopoo011;

//SE TRATA DO ESTADO DE UM CARRO
public class CarroTestar {
    public static void main(String[] args) {
        //Carros comuns
        Carro carro1 = new Carro("Fuscão Preto");
        Carro carro2 = new Carro("Fiat Uno");
        
        System.out.println("\n\n\t\t**CARROS COMUNS**");
        
        carro1.info();

        carro2.sofrerDano(3);//Uno foi destruido (blindagem <= 0), foi destruído/desligado
        carro2.info();
    
        //Carros de combate
        CarroCombate carroComb1 = new CarroCombate("Tanque", 100);
        CarroCombate carroComb2 = new CarroCombate("Insurgent", 78);
        CarroCombate carroComb3 = new CarroCombate("Kuruma", 45);

        System.out.println("\n\n\t\t**CARROS DE COMBATE**");
        
        carroComb3.sofrerDano(48); //KURUMA sendo destruído

        carroComb1.infoCombate();
        carroComb2.infoCombate();
        carroComb3.infoCombate();
    }
    
}
