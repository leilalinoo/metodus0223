package metodus0223;

public class Metodus0223 {

    public static void main(String[] args) {
        int osszeg = elso10szamosszege();
        int szam1 = 333;
        int szam2 = 666;
        
        osszeg = osszead(szam1, szam2);
        kiir("%d + %d = %d".formatted(szam1, szam2, osszeg));
        
        osszeg = osszead(1,2);
        osszeg = osszead(osszeg, 3);
        osszeg = osszead(osszeg,4);
        kiir("1 + 2 + 3 + 4 = "+osszeg);
        
        //3 szám összegének a gyöke
        double gyok;
        osszeg = osszead(7,7);
        osszeg = osszead(osszeg, 7);
        gyok = Math.sqrt(osszeg);
        
        kiir("7 + 7 + 7 gyöke =  "+gyok);
        
        
        
        
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
