public class PocitacZnamekProgramko extends PocitacZnamek{
    @Override
    public void vypoctiVyslednouZnamku() {
        double soucet = 0;
        int soucetVah = 0;
        for (Znamka z: getZnamky()){
            soucet = soucet + z.getZnamka();
            soucetVah = soucetVah + z.getVaha();
        }
        double prumer = soucet /soucetVah;
        if (prumer<=1.45){
            setVyslednaZnamka(1);
        } else if (prumer<=2.4){
            setVyslednaZnamka(2);
        } else if (prumer<=3.4){
            setVyslednaZnamka(3);
        } else if (prumer<=4.3){
            setVyslednaZnamka(4);
        }
    }
}
