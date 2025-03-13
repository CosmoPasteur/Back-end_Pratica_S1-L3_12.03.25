package esercizio_2;

public class Sim {
    //Attributi
    long numeroTelefono;
    double creditoResiduo;
    String[] ultimeChiamate;

    //Metodo costruttore
    public Sim(long numeroTelefono, double creditoResiduo, String ultimeChiamate) {
        this.numeroTelefono = numeroTelefono;
        this.creditoResiduo = creditoResiduo;
        this.ultimeChiamate = new String[]{ultimeChiamate};
    }

    // Costruttore per SIM con numero e credito iniziale 0, senza chiamate
    public Sim(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoResiduo = 0.0; // Credito iniziale a zero
        this.ultimeChiamate = new String[0]; // Array vuoto
    }


    // Metodo per mostrare le informazioni
    public void mostraInfo() {
        System.out.println("Numero di Telefono: " + numeroTelefono);
        System.out.println("Credito residuo: " + creditoResiduo + "€");
        System.out.println("Ultime Chiamate:");
        if (ultimeChiamate.length == 0) {
            System.out.println(" - Nessuna chiamata effettuata.");
        } else {
            for (String chiamata : ultimeChiamate) {
                System.out.println("- " + chiamata);
            }
        }
    }

}
