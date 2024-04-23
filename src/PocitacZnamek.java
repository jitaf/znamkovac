import java.util.ArrayList;

public abstract class PocitacZnamek {
    private ArrayList<Znamka>znamky = new ArrayList<>();
    private int vyslednaZnamka;

    public int getVyslednaZnamka() {
        return vyslednaZnamka;
    }

    public void setVyslednaZnamka(int vyslednaZnamka) {
        this.vyslednaZnamka = vyslednaZnamka;
    }

    public ArrayList<Znamka> getZnamky() {
        return znamky;
    }

    public abstract void vypoctiVyslednouZnamku();

    public void pridejZnamku(int vaha, double znamka){
        Znamka z = new Znamka(znamka, vaha);
        znamky.add(z);
    }

    public void vypisVyslednouZnamku(){
        vypoctiVyslednouZnamku();
        System.out.println("Vysledna znamka je " + vyslednaZnamka + ".");
    }
}
