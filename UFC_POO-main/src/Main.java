import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Scanner input = new Scanner(System.in);

    public static void mostrarLutadores(List<Lutador> lista) {
        if (lista.isEmpty()) {
            System.out.println("Nenhum lutador cadastrado.");
            return;
        }

        for (Lutador lutador : lista) {
            lutador.apresentarLutador();
        }
    }

    public static void mostrarLutas(List<Luta> lista) {
        if (lista.isEmpty()) {
            System.out.println("Nenhuma luta cadastrada.");
            return;
        }

        for (Luta luta : lista) {
            luta.verLuta();
        }
    }

    public static int criarIdLutador(List<Lutador> listaLutador) {
        return listaLutador.size() + 1;
    }
    
    public static int criarIdLuta(List<Luta> listaLuta) {
        return listaLuta.size() + 1;
    }
    
    public static Luta cadastrarLuta(List<Luta> listaLuta, List<Lutador> listaLutador) {

        int novoId = criarIdLuta(listaLuta);

        input.nextLine();
 
        System.out.print("Digite a quantidade de rounds: ");
        byte rounds = input.nextByte();

        System.out.print("Digite o desafiante (por ID): ");
        int idDesafiante = input.nextInt();

        System.out.print("Digite o desafiado (por ID): ");
        int idDesafiado = input.nextInt();
        
        if (idDesafiante == idDesafiado) {
        		System.out.print("\nSelecione ID´s diferentes!\n");
        		System.out.print("\nA luta não foi cadastrada!\n");
        		return null;
        } else {
        	
        		Lutador desafiante = listaLutador.get(idDesafiante-1);
            Lutador desafiado = listaLutador.get(idDesafiado-1);
            
	        return new Luta(
	                rounds,
	                novoId,
	                desafiado,
	                desafiante
	        );
        }
    }

    public static Lutador cadastrarLutador(List<Lutador> listaLutador) {

        int novoId = criarIdLutador(listaLutador);

        input.nextLine();

        System.out.print("Digite o nome do lutador: ");
        String nome = input.nextLine();

        System.out.print("Digite a nacionalidade do lutador: ");
        String nacionalidade = input.nextLine();

        System.out.print("Digite a idade do lutador: ");
        byte idade = input.nextByte();

        System.out.print("Digite a altura do lutador: ");
        double altura = input.nextDouble();

        System.out.print("Digite o peso do lutador: ");
        double peso = input.nextDouble();

        System.out.print("Digite as vitórias do lutador: ");
        byte vitorias = input.nextByte();

        System.out.print("Digite as derrotas do lutador: ");
        byte derrotas = input.nextByte();

        System.out.print("Digite os empates do lutador: ");
        byte empates = input.nextByte();

        return new Lutador(
                novoId,
                nome,
                nacionalidade,
                idade,
                altura,
                peso,
                vitorias,
                derrotas,
                empates
        );
    }

    public static void realizarLuta(List<Luta> listaLuta) {

        if (listaLuta.isEmpty()) {
            System.out.println("Nenhuma luta cadastrada.");
            return;
        }

        int opcao;

        do {

            Console.limpar();

            System.out.println("===== LUTAS =====");
            mostrarLutas(listaLuta);

            System.out.print("Selecione a luta pelo Nº (0 para voltar): ");
            opcao = input.nextInt();

            if (opcao > 0 && opcao <= listaLuta.size()) {

                Console.limpar();

                Luta luta = listaLuta.get(opcao - 1);

                System.out.println("===== REALIZANDO LUTA =====");
                luta.realizarLuta();

                Lutador vencedor = luta.retornarGanhador();

                System.out.println();

                if (vencedor != null) {
                    System.out.println("===== VENCEDOR =====");
                    vencedor.apresentarLutador();
                } else {
                    System.out.println("A luta terminou empatada!");
                }

                System.out.println("\nPressione ENTER para continuar...");
                input.nextLine();
                input.nextLine();

            } else if (opcao != 0) {
                System.out.println("Luta inválida!");
            }

        } while (opcao != 0);
    }

    public static void main(String[] args) {

        List<Lutador> listaLutador = new ArrayList<>();
        List<Luta> listaLuta = new ArrayList<>();
        //List<Arbitro> listaArbitro = new ArrayList<>();

        listaLutador.add(new Lutador(
                1,
                "Lucas",
                "Brasileiro",
                (byte) 25,
                1.75,
                61.1,
                (byte) 0,
                (byte) 4,
                (byte) 0
        ));

        listaLutador.add(new Lutador(
                2,
                "Matheus",
                "Brasileiro",
                (byte) 25,
                1.75,
                61.1,
                (byte) 0,
                (byte) 4,
                (byte) 0
        ));

        listaLutador.add(new Lutador(
                3,
                "Danilo",
                "Brasileiro",
                (byte) 25,
                1.75,
                61.1,
                (byte) 0,
                (byte) 4,
                (byte) 0
        ));

        listaLutador.add(new Lutador(
                4,
                "Vitor",
                "Brasileiro",
                (byte) 25,
                1.75,
                61.1,
                (byte) 0,
                (byte) 4,
                (byte) 0
        ));

        listaLuta.add(new Luta(
                (byte) 5,
                1,
                listaLutador.get(0),
                listaLutador.get(1)
        ));

        listaLuta.add(new Luta(
                (byte) 5,
                2,
                listaLutador.get(2),
                listaLutador.get(3)
        ));

        int opcao;

        do {

            Console.limpar();

            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1 - Mostrar Lutadores");
            System.out.println("2 - Mostrar Lutas");
            System.out.println("3 - Realizar Luta");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:

                    Console.limpar();

                    int opcaoLutador;

                    do {

                        System.out.println("===== LUTADORES =====");

                        mostrarLutadores(listaLutador);

                        System.out.println("\n1 - Cadastrar Lutador");
                        System.out.println("0 - Voltar");

                        System.out.print("Escolha uma opção: ");
                        opcaoLutador = input.nextInt();

                        switch (opcaoLutador) {

                            case 1:

                                Console.limpar();

                                System.out.println("===== CADASTRAR LUTADOR =====");

                                Lutador novoLutador =
                                        cadastrarLutador(listaLutador);

                                listaLutador.add(novoLutador);

                                System.out.println("\nLutador cadastrado com sucesso!");

                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Opção inválida!");
                        }

                    } while (opcaoLutador != 0);

                    break;

                case 2:

                    Console.limpar();
                    
                    int opcaoLuta;

                    do {

                        System.out.println("===== LUTAS =====");

                        mostrarLutas(listaLuta);

                        System.out.println("\n1 - Cadastrar Luta");
                        System.out.println("0 - Voltar");

                        System.out.print("Escolha uma opção: ");
                        opcaoLuta = input.nextInt();

                        switch (opcaoLuta) {

                            case 1:

                                Console.limpar();
                                
                                mostrarLutadores(listaLutador);

                                System.out.println("===== CADASTRAR LUTA =====");
                                                           
                                Luta novaLuta =
                                		cadastrarLuta(listaLuta, listaLutador);
                                
                                if (novaLuta != null) {
                                		listaLuta.add(novaLuta);
                                } 
                                                 
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("Opção inválida!");
                        }

                    } while (opcaoLuta != 0);

                    

                case 3:

                    realizarLuta(listaLuta);

                    break;

                case 0:

                    System.out.println("Saindo do sistema...");

                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        input.close();
    }
}
