package metodus0223;

public class Equalizer {

    public static void main(String[] args) {
        eq();
        eq(12);
        eq();
        eq(8);
        eq();
    }
    private static void eq(){
        String szin = "\u001B[45m";
        int szam = (int)(Math.random()*(7-3+1)+3);
        for (int i = 0; i < szam; i++) {
            System.out.print(szin + " ");
        }
        System.out.println("");
    }
    
    private static void eq(int hossz){
        String szin = "\u001B[45m";
        for (int i = 0; i < hossz; i++) {
            System.out.print(szin + " ");
        }
        System.out.println("");
    }
}
