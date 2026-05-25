import java.util.Random;

public class Luta {

    private Lutador desafiante;
    private Lutador desafiado;
    private Lutador vencedor;
    // private Arbitro arbitro;

    private boolean status;

    private byte rounds;
    private int id;

    public Luta(
            byte rounds,
            int id,
            Lutador desafiado,
            Lutador desafiante
    ) {

        this.rounds = rounds;
        this.id = id;
        this.desafiado = desafiado;
        this.desafiante = desafiante;

        this.status = false;
    }

    public void statusLuta() {

        if (status) {
            System.out.println("Luta realizada!");
        } else {
            System.out.println("Luta não realizada!");
        }
    }

    public void apresentarLuta() {

        System.out.println("===== INFORMAÇÕES DA LUTA =====");

        System.out.println("Luta Nº: " + id);

        System.out.println("Rounds: " + rounds);

        System.out.println(
                "Desafiante: " + desafiante.getNome()
        );

        System.out.println(
                "Desafiado: " + desafiado.getNome()
        );

        if (vencedor != null) {

            System.out.println(
                    "Vencedor: " + vencedor.getNome()
            );

        } else if (status) {

            System.out.println("Resultado: Empate");
        }

        statusLuta();

        System.out.println();
    }

    public void verLuta() {

        System.out.println("===== LUTA Nº " + this.id + " =====");

        System.out.println(
                "Desafiante -> "
                        + this.desafiante.statusLutador()
        );

        System.out.println("VS");

        System.out.println(
                "Desafiado -> "
                        + this.desafiado.statusLutador()
        );

        System.out.println();
    }

    public void realizarLuta() {

        if (status) {

            System.out.println(
                    "Essa luta já foi realizada!"
            );

            return;
        }

        Random rand = new Random();

        int resultado = rand.nextInt(3);

        System.out.println("===== RESULTADO DA LUTA =====");

        if (resultado == 0) {

            vencedor = desafiante;

            desafiante.ganharLuta();

            desafiado.perderLuta();

            System.out.println(
                    "O vencedor foi: "
                            + vencedor.getNome()
            );

        } else if (resultado == 1) {

            vencedor = desafiado;

            desafiado.ganharLuta();

            desafiante.perderLuta();

            System.out.println(
                    "O vencedor foi: "
                            + vencedor.getNome()
            );

        } else {

            vencedor = null;

            desafiante.empatarLuta();

            desafiado.empatarLuta();

            System.out.println(
                    "A luta terminou empatada!"
            );
        }

        status = true;

//        if (arbitro != null) {
//            arbitro.aumentarArbitragens();
//        }
    }

    public Lutador retornarGanhador() {
        return vencedor;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

//    public Arbitro getArbitro() {
//        return arbitro;
//    }
//
//    public void setArbitro(Arbitro arbitro) {
//        this.arbitro = arbitro;
//    }

    public byte getRounds() {
        return rounds;
    }

    public void setRounds(byte rounds) {
        this.rounds = rounds;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}