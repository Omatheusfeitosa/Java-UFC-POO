abstract class Pessoa implements Apresentavel {
    private String nome;
    private String nacionalidade;
    private byte idade;
    private double altura;

    public Pessoa(String nome, String nacionalidade, byte idade, double altura) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public byte getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}