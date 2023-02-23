package metodus0223;

public class Metodus0223 {

    public static void main(String[] args) {
        elso10szamosszege();
        osszead(333, 333);
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
        kiir(a + " + " + b + " = " + (a + b));
        return a + b;
    }

    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }

}
