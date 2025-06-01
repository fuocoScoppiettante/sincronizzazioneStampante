public class Dipendente extends Thread{
    private String nome;
    private Stampante stampante;

    public Dipendente(String nome, Stampante stampante) {
        this.nome = nome;
        this.stampante = stampante;
    }

    @Override
    public void run(){
        int pagine = (int) (Math.random()* 3 + 1);
        System.out.println(nome + " ha " + pagine + " pagine da stampare");
        System.out.println(nome + " inizia a lavorare al documento");
            try {
                int attesa = 1000 + (int)(Math.random() * 4000); // tra 1000 e 5000 ms
                Thread.sleep(attesa);
            } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
            }
        
        System.out.println(nome+ "ha FINITO DI ELABORARE IL DOCUMENTO");
        System.out.println(nome+ "  n."+ pagine + " pagine da stampare");
        System.out.println("------------------------"+nome+" in coda per stampare");
        System.out.println(nome + " sta stampando");
        synchronized (stampante) {
            while (pagine == 0) {
               stampante.Stampa(nome, pagine);
               pagine--; 
            }    
        }
        
    }

}