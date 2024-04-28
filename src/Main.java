import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean konec = false;
        PocitacZnamekCestina cestina = new PocitacZnamekCestina();
        PocitacZnamekMatika matika = new PocitacZnamekMatika();
        PocitacZnamekProgramko programko = new PocitacZnamekProgramko();
        System.out.println("Vítejte v aplikaci znamkovac.");

        while (!konec){
            System.out.println("----------------------------------------------------------");
            System.out.println("Pro přidání známky z češtiny stiskněte 1.");
            System.out.println("Pro přidání známky z matiky stiskněte 2.");
            System.out.println("Pro přidání známky z programovani stiskněte 3.");
            System.out.println("Pro výpis zavěrečné známky z češtiny stiskněte 4.");
            System.out.println("Pro výpis zavěrečné známky z matiky stiskněte 5.");
            System.out.println("Pro výpis zavěrečné známky z programka stiskněte 6.");
            System.out.println("Pro výpis zavěrečné známky ze všech předmětů stiskněte 7.");
            System.out.println("Pro výpis všech známek ze všech předmětů 8.");
            System.out.println("Pro výpis počtu známek z matiky stiskněte 9.");
            System.out.println("Pro výpis nejlepší a nejhorší známky stiskněte 10.");
            System.out.println("Pro konec programu, stiskněte 0.");
            System.out.println("----------------------------------------------------------");
            String vstup = sc.nextLine();
            switch (vstup){
                case "1":
                    System.out.println("Zadej váhu známky: ");
                    int vaha = sc.nextInt();
                    System.out.println("Zadej známku: ");
                    double znamka = sc.nextDouble();
                    sc.nextLine();
                    cestina.pridejZnamku(vaha, znamka);
                    break;
                case "2":
                    System.out.println("Zadej váhu známky: ");
                    vaha = sc.nextInt();
                    System.out.println("Zadej známku: ");
                    znamka = sc.nextDouble();
                    sc.nextLine();
                    matika.pridejZnamku(vaha, znamka);
                    break;
                case "3":
                    System.out.println("Zadej váhu známky: ");
                    vaha = sc.nextInt();
                    System.out.println("Zadej známku: ");
                    znamka = sc.nextDouble();
                    sc.nextLine();
                    programko.pridejZnamku(vaha, znamka);
                    break;
                case "4":
                    cestina.vypisVyslednouZnamku();
                    break;
                case "5":
                    matika.vypisVyslednouZnamku();
                    break;
                case "6":
                    programko.vypisVyslednouZnamku();
                    break;
                case "7":
                    System.out.print("cestina: ");
                    cestina.vypisVyslednouZnamku();
                    System.out.print("matika: ");
                    matika.vypisVyslednouZnamku();
                    System.out.print("programko: ");
                    programko.vypisVyslednouZnamku();
                    System.out.println();
                    break;
                case "8":
                    System.out.print("cestina: ");
                    cestina.vypisVsechnyZnamky();
                    System.out.print("matika: ");
                    matika.vypisVsechnyZnamky();
                    System.out.print("programko: ");
                    programko.vypisVsechnyZnamky();
                    System.out.println();
                    break;
                case "9":
                    System.out.print("Pocet znamek z matiky je ");
                    matika.getZnamky().size();
                    System.out.println(". ");
                    break;
                case "10":
                    Znamka nejlepsi = matika.getZnamky().get(0);
                    Znamka nejhorsi = matika.getZnamky().get(0);
                    String predmetNejlepsi = "matika";
                    String predmetNejhorsi = "matika";
                    for(Znamka z: matika.getZnamky()){
                        if (z.getZnamka()<nejlepsi.getZnamka()){
                            nejlepsi =z;
                        } else if (z.getZnamka()>nejhorsi.getZnamka()){
                            nejhorsi = z;
                        }
                    }
                    for(Znamka z: cestina.getZnamky()){
                        if (z.getZnamka()<nejlepsi.getZnamka()){
                            nejlepsi =z;
                            predmetNejlepsi = "cestina";
                        }else if (z.getZnamka()>nejhorsi.getZnamka()){
                            nejhorsi = z;
                            predmetNejhorsi = "cestina";
                        }
                    }
                    for(Znamka z: programko.getZnamky()){
                        if (z.getZnamka()<nejlepsi.getZnamka()){
                            nejlepsi =z;
                            predmetNejlepsi = "programovani";
                        }else if (z.getZnamka()>nejhorsi.getZnamka()){
                            nejhorsi = z;
                            predmetNejhorsi = "programovani";
                        }
                    }
                    System.out.println(" Nejlepsi znamka je " + nejlepsi.getZnamka() + " a to z predmetu " + predmetNejlepsi);
                    System.out.println(" Nejhorsi znamka je " + nejhorsi.getZnamka() + " a to z predmetu " + predmetNejhorsi);
                    break;
                case "0":
                    konec=true;
            }
        }
    }
}