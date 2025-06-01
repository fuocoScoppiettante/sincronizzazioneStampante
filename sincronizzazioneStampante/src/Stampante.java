import java.util.concurrent.Semaphore;

public class Stampante {

    private String nome;
    private String modello;
    private Semaphore semaforo;

    public Stampante(String nome, String modello) {
        this.nome = nome;
        this.modello = modello;
        semaforo = new Semaphore(1);
    }

    public void Stampa(String nome, int pagine) {
        try {
            semaforo.acquire();
                System.out.println(
                    "-------------------------------\n" +
                    "|\t                      |\n" +
                    "|\t                      |\n" +
                    "|\t                      |\n" +
                    "|\tPRINTED BY            |\n" +
                    "|\t"+ nome +"\t\t      "+"|\n" +
                    "|\t                      |\n" +
                    "|\t                      |\n" +
                    "|\t"+"foglio "+pagine+"\t"+" "+" "+" "+" "+" "+" "+"|\n" +
                    "|\t                      |\n" +
                    "|\t                      |\n" +
                    "|\t                      |\n" +
                    "-------------------------------"
                );
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaforo.release();
        }
    }
}
