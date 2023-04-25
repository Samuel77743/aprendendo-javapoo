package exerciciopoo006;

public class AlunoTestar {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(); //Os atributos ainda não tem valores definidos

        //Setando e printando nome
        aluno1.setNome("Samuel"); //Atribuição do nome via método
        System.out.println(aluno1.getNome()); //Printando nome para confirmação

        //Setando e printando idade
        aluno1.setIdade(17); //Atribuindo valor da idade no parâmetro
        System.out.println(aluno1.getIdade()); //Printando valor retornado referente a idade

    }
    
}
