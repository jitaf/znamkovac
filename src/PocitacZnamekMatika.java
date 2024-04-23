public class PocitacZnamekMatika extends PocitacZnamek{

    @Override
    public void vypoctiVyslednouZnamku() {
        double soucet = 0;
        int soucetVah = 0;
        Znamka nejlepsi = getZnamky().get(0);
        Znamka nejhorsi = getZnamky().get(0);
        for (Znamka z: super.getZnamky()){
            soucet = soucet + z.getZnamka();
            soucetVah = soucetVah + z.getVaha();
            if (z.getZnamka()<nejlepsi.getZnamka()){
                nejlepsi = z;
            } else if (z.getZnamka()>nejhorsi.getZnamka()){
                nejhorsi=z;
            }
        }
        soucet = soucet - nejlepsi.getZnamka() - nejhorsi.getZnamka();
        soucetVah = soucetVah - nejlepsi.getVaha() - nejhorsi.getVaha();

        double prumer = soucet /soucetVah;
        super.setVyslednaZnamka((int)Math.round(prumer));

    }
}
