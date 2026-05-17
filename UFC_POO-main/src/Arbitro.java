public class Arbitro extends Pessoa {

    private byte arbitragens;

    public Arbitro(
            String nome,
            String nacionalidade,
            byte idade,
            double altura,
            byte arbitragens
    ) {

        super(nome, nacionalidade, idade, altura);

        this.arbitragens = arbitragens;
    }

    public void aumentarArbitragens() {
        this.arbitragens++;
    }

    public void apresentarArbitro() {

        System.out.printf(
                "Nome: %s | Nacionalidade: %s | Idade: %d | Altura: %.2f | Arbitragens: %d\n",
                getNome(),
                getNacionalidade(),
                getIdade(),
                getAltura(),
                getArbitragens()
        );
    }

    public byte getArbitragens() {
        return arbitragens;
    }

    public void setArbitragens(byte arbitragens) {
        this.arbitragens = arbitragens;
    }
}