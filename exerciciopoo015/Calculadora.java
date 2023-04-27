package exerciciopoo015;

import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Numero num1 = new Numero();
        Numero num2 = new Numero();
        Numero resp = new Numero();

        String perg;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("\nDigite o 1º Valor --> ");
            num1.setValor(teclado.nextInt());

            System.out.print("Digite o 2º Valor --> ");
            num2.setValor(teclado.nextInt());

            resp.setValor(num1.getValor() + num2.getValor());

            System.out.printf("%d + %d = %d\n\n", num1.getValor(), num2.getValor(), resp.getValor());

            System.out.print("Deseja continua [Sim/Não] --> ");
            perg = teclado.next();

        } while(perg.equals("Sim") || perg.equals("sim"));

        teclado.close();
    }
}
