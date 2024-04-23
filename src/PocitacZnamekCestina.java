public class PocitacZnamekCestina extends PocitacZnamek
{


    @Override
    public void vypoctiVyslednouZnamku() {
        double soucet = 0;
        for (Znamka z: super.getZnamky()){
            soucet = soucet + z.getZnamka();
        }

        double prumer = soucet /super.getZnamky().size();
        super.setVyslednaZnamka((int)Math.round(prumer));
    }
}
