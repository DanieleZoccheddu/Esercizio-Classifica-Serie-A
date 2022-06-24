import java.util.ArrayList;

public class Squadra implements Comparable<Squadra>{
    private  int id;
    private static int n = 0;
    private String nome;
    private int punteggio;
    private int golFatti;
    private int golSubiti;
    private ArrayList<Giocatore> rosaGiocatori;

    public Squadra(String nome){
        this.nome = nome;
        this.punteggio = 0;
        this.id = n;
        n++;
        this.golFatti = 0;
        this.golSubiti = 0;

    }

    public void aggiungiGiocatore(Giocatore g){
        this.rosaGiocatori.add(g);
    }



    public String getNome() {
        return nome;
    }


    public int getId() {
        return id;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio){
        this.punteggio += punteggio;
    }
    public void setGolFatti(int golFatti){
        this.golFatti += golFatti;
    }

    public void setGolSubiti(int golSubiti) {
        this.golSubiti += golSubiti;
    }

    public int getGolFatti() {
        return this.golFatti;
    }
    public int getGolSubiti(){
        return this.golSubiti;
    }

    @Override
    public String toString() {
        String s = this.nome + " " + this.punteggio + " gol fatti: " + this.golFatti + " gol subiti: " + this.golSubiti ;
        return s;
    }

    @Override
    public int compareTo(Squadra s){
        return   s.getPunteggio() - this.getPunteggio();
    }
}
