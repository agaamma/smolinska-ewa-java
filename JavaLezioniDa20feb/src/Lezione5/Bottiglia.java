package Lezione5;

public class Bottiglia {
    private int capacita;
    private int quantita;

    public Bottiglia(int capacita) {
        this.capacita = capacita;
        this.quantita = 0;
    }

    public void riempi (int quantita){
        this.quantita +=quantita;
        if(this.quantita>capacita)
            this.quantita =capacita;
    }
    public void svuota (int quantita){
        this.quantita -= quantita;
        if(this.quantita<0)
            this.quantita=0;
    }



    @Override
    public String toString() {
        return "Bottiglia{" +
                "capacita=" + capacita +
                ", quantita=" + quantita +
                '}';
    }
}
