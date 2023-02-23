package metodus0223;

public class Metodus0223 {

    public static void main(String[] args) {
        int osszeg = elso10szamosszege();
        int szam1 = 333;
        int szam2 = 666;
        
        osszeg = osszead(szam1, szam2);
        kiir("%d + %d = %d".formatted(szam1, szam2, osszeg));
        
        int ujszam1 = 1;
        int ujszam2 = 2;
        int ujszam3 = 3;
        int ujszam4 = 4;
        
        
        
        
    }

    private static int elso10szamosszege() {

        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        kiir("Az első 10 szám összege: " + osszeg);
        return osszeg;
    }

    private static int osszead(int a, int b) {
        //kiir(a + " + " + b + " = " + (a + b));
        return a + b;
    }

    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }

}
