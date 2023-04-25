package exerciciopoo006;

public class Aluno {

    private String nome; //Este atributo não é manipulável fora desta classe
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if(idade > 0 && idade < 125) {
            this.idade = idade;
            System.out.println("\nIdade atribuida com sucesso --> "+idade);
        }
        else {
            System.out.println("\nIdade inválida");
        }
    }

    public int getIdade() {
        return this.idade;
    }
    
}
