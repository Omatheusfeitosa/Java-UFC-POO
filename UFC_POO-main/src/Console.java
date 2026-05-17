import java.io.IOException;

public class Console {

    private Console() {
    }

    public static void limpar() {

        try {

            String sistema = System.getProperty("os.name");

            if (sistema.contains("Windows")) {

                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();

            } else {

                System.out.print("\033[H\033[2J");
                System.out.flush();

            }

        } catch (IOException | InterruptedException e) {

            System.out.println("Não foi possível limpar o console.");

        }
    }
}