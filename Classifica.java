import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Classifica {
    private List<Squadra> classifica = new ArrayList<>();

    public Classifica(){

    }

    public void aggiungiSquadra(Squadra s){
        this.classifica.add(s);
    }


       public void esitoPartita(Squadra squadraCasa, int golCasa, Squadra squadraOspite, int golOspite){ //gestisce il punteggio delle due squadre in base all'esito
            if(!squadraCasa.equals(squadraOspite)){
                if(golCasa == golOspite){
                    squadraCasa.setPunteggio(1);
                    squadraOspite.setPunteggio(1);
                }
                else if(golCasa > golOspite){
                    squadraCasa.setPunteggio(3);

                }
                else{
                    squadraOspite.setPunteggio(3);
                }

                squadraCasa.setGolFatti(golCasa);
                squadraCasa.setGolSubiti(golOspite);
                squadraOspite.setGolFatti(golOspite);
                squadraOspite.setGolSubiti(golCasa);
            }



       }
    public void getClassifica(){  //ritorna la classifica attuale, ordinata per punteggio
        Collections.sort(classifica);

        for(int i = 0; i < classifica.size(); i++){
            System.out.println(classifica.get(i));
        }
    }


    void getMigliorAttacco(){ //ritorna la squadra che ha segnato più gol
        int squadra = 0;
        int attacco = 0;
        for(int i = 0; i < classifica.size(); i++){
            if(classifica.get(i).getGolFatti() > attacco){
                squadra = i;
                attacco = classifica.get(i).getGolFatti();
            }
        }
        System.out.println(classifica.get(squadra));
    }
    void getPeggiorDifesa(){ //ritorna la squadra che ha concesso più gol
        int squadra = 0;
        int difesa = 0;
        for(int i = 0; i < classifica.size(); i++){
            if(classifica.get(i).getGolSubiti() > difesa){
                squadra = i;
                difesa = classifica.get(i).getGolFatti();
            }
        }
        System.out.println(classifica.get(squadra));
    }
}
