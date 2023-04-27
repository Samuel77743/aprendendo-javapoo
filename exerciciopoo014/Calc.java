package exerciciopoo014;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        char perg;

        do{
            System.out.printf("\nDigite o 1º Valor --> ");
            n1.setValor(teclado.nextInt()); 

            System.out.printf("Digite o 2º Valor --> ");
            n2.setValor(teclado.nextInt());
            
            res.setValor((n1.getValor() + n2.getValor()));

            System.out.printf("\n%d + %d = %d\n\n", n1.getValor(), n2.getValor(), res.getValor());

            System.out.print("Deseja continuar calculando [S/N] --> ");
            perg = teclado.next().charAt(0);
            
        } while(perg == 'S' || perg == 's');
        
        teclado.close();


    }
}   