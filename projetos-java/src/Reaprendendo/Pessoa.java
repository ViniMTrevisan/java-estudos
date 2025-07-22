package Reaprendendo;

public class Pessoa {

    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String falar(){
        return "Olá, meu nome é " + nome + " e tenho " + idade + " anos";
    }
}
