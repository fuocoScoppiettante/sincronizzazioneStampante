public class App {
    public static void main(String[] args) throws Exception {
        
        Dipendente d1, d2, d3, d4, d5;
        Stampante s = new Stampante("HP", "LaserJet Pro M404dn");
        d1 = new Dipendente("Pippo", s);
        d2 = new Dipendente("May", s);
        d3 = new Dipendente("Lia", s);
        d4 = new Dipendente("Silvia", s);
        d5 = new Dipendente("Mario", s);

        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();


    }
}








