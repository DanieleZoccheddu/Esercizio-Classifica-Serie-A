import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Squadra s1 = new Squadra( "inter");
        Squadra s2 = new Squadra( "juve");
        Squadra s3 = new Squadra( "marcioformaggio"); //TODO marcioformaggio.com
        Squadra s4 = new Squadra( "venezianincalliti");
        Squadra s5 = new Squadra( "roma");
        Squadra s6 = new Squadra( "arancin*");

        Classifica classifica = new Classifica();
        classifica.aggiungiSquadra(s1);
        classifica.aggiungiSquadra(s2);
        classifica.aggiungiSquadra(s3);
        classifica.aggiungiSquadra(s4);
        classifica.aggiungiSquadra(s5);
        classifica.aggiungiSquadra(s6);

        classifica.esitoPartita(s1, random.nextInt(5), s2, random.nextInt(5));
        classifica.esitoPartita(s3, random.nextInt(5), s4, random.nextInt(5));
        classifica.esitoPartita(s5, random.nextInt(5), s6, random.nextInt(5));
        classifica.esitoPartita(s1, random.nextInt(5), s3, random.nextInt(5));
        classifica.esitoPartita(s2, random.nextInt(5), s6, random.nextInt(5));
        classifica.esitoPartita(s4, random.nextInt(5), s5, random.nextInt(5));

        classifica.getClassifica();

        System.out.println("Stampo la squadra col migliore attacco");
        classifica.getMigliorAttacco();
        System.out.println("Stampo la squadra con la peggiore difesa");
        classifica.getPeggiorDifesa();

    }
}
