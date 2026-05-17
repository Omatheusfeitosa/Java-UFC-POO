public abstract class Pessoa {

    private String nome;
    private String nacionalidade;

    private int idade;

    private double altura;

    public Pessoa(
            String nome,
            String nacionalidade,
            int idade,
            double altura
    ) {

        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentarPessoa() {

        System.out.printf(
                """
                Nome: %s
                Nacionalidade: %s
                Idade: %d
                Altura: %.2f
                """,
                nome,
                nacionalidade,
                idade,
                altura
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {

        if (nacionalidade != null && !nacionalidade.isBlank()) {
            this.nacionalidade = nacionalidade;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        if (idade > 0) {
            this.idade = idade;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {

        if (altura > 0) {
            this.altura = altura;
        }
    }
}