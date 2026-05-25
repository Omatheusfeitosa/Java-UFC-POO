public class Lutador extends Pessoa implements Apresentavel {

    private int id;

    private String categoria;

    private double peso;

    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(
            int id,
            String nome,
            String nacionalidade,
            int idade,
            double altura,
            double peso,
            int vitorias,
            int derrotas,
            int empates
    ) {

        super(nome, nacionalidade, idade, altura);

        this.id = id;

        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;

        setPeso(peso);
    }

    public void ganharLuta() {
        this.vitorias++;
    }

    public void perderLuta() {
        this.derrotas++;
    }

    public void empatarLuta() {
        this.empates++;
    }

    public void apresentarLutador() {

        System.out.printf(
                """
                ==============================
                ID: %d
                Nome: %s
                Nacionalidade: %s
                Idade: %d
                Altura: %.2f
                Peso: %.2f
                Categoria: %s
                Vitórias: %d
                Derrotas: %d
                Empates: %d
                ==============================
                                
                """,
                getId(),
                getNome(),
                getNacionalidade(),
                getIdade(),
                getAltura(),
                getPeso(),
                getCategoria(),
                getVitorias(),
                getDerrotas(),
                getEmpates()
        );
    }

    @Override
    public void apresentar() {
        apresentarLutador();
    }

    public String statusLutador() {

        return String.format(
                """
                Nome: %s
                Altura: %.2f
                Peso: %.2f
                Categoria: %s
                """,
                getNome(),
                getAltura(),
                getPeso(),
                getCategoria()
        );
    }

    private void definirCategoria() {

        if (peso < 52.2) {

            categoria = "Inválida";

        } else if (peso <= 56.7) {

            categoria = "Mosca";

        } else if (peso <= 61.2) {

            categoria = "Galo";

        } else if (peso <= 65.8) {

            categoria = "Pena";

        } else if (peso <= 70.3) {

            categoria = "Leve";

        } else if (peso <= 77.1) {

            categoria = "Meio-Médio";

        } else if (peso <= 83.9) {

            categoria = "Médio";

        } else if (peso <= 93.0) {

            categoria = "Meio-Pesado";

        } else if (peso <= 120.2) {

            categoria = "Pesado";

        } else {

            categoria = "Inválida";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;

        definirCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }
}