import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean konec = false;
        PocitacZnamekCestina cestina = new PocitacZnamekCestina();
        PocitacZnamekMatika matika = new PocitacZnamekMatika();
        PocitacZnamekProgramko programko = new PocitacZnamekProgramko();

        while (!konec){
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
                    cestina.pridejZnamku(vaha, znamka);
                    break;
                case "2":
                    System.out.println("Zadej váhu známky: ");
                    vaha = sc.nextInt();
                    System.out.println("Zadej známku: ");
                    znamka = sc.nextDouble();
                    matika.pridejZnamku(vaha, znamka);
                    break;
                case "3":
                    System.out.println("Zadej váhu známky: ");
                    vaha = sc.nextInt();
                    System.out.println("Zadej známku: ");
                    znamka = sc.nextDouble();
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
                    break;
                case "0":
                    konec=true;
            }
        }
    }
}