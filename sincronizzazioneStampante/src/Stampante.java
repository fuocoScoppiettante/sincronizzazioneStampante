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

    public void Stampa(String nome, int pagine){
        try{
            semaforo.acquire();
        }catch(InterruptedException e){
            for(int i=1; i< pagine; i++){

                System.out.println(" ---------------------" + 
                                    "|                   |" +
                                    "|     PRINTED BY    |" +
                                    "|"+   nome+  "      |" +
                                    "|                   |" +
                                    "|                   |" +
                                    "|"+  "foglio"+ i+  "|" +
                                    "|                   |" + 
                                    "---------------------"
                );
            }
                
        }
        

        
        
    }
}
