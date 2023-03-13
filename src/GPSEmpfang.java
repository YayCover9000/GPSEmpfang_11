import java.util.Scanner;
public class GPSEmpfang {
    public static int ausgabewert = 0;
    public static void einlesenLaufzeiten(int laufzeiten[]) {
        int zwischenspeicherEinlesen;
        boolean exit = false;
        boolean schreiben = false;
        Scanner scanner = new Scanner(System.in);
            for (int e = 0; e < laufzeiten.length && !exit;) {
                System.out.println("Werte Eingeben: ");
                zwischenspeicherEinlesen = scanner.nextInt();
                // Abbruchbedingung checken
                if (zwischenspeicherEinlesen == -1) {
                    exit  = true;
                }
                // nur werte zwischen 80 und 130 inclusive randwerte
                else if (zwischenspeicherEinlesen >= 80 && zwischenspeicherEinlesen <= 130) {
                    laufzeiten[e] = zwischenspeicherEinlesen;
                    e++;
                } else {
                    System.out.println("falsche Eingabe");
                }
            }
            scanner.close();
            for ( int e: laufzeiten) {
                System.out.println(e);
            }
        GPSEmpfang.ausgeben(laufzeiten);
    }
    public static void ausgeben(int laufzeiten[]) {
        System.out.println("ausgeben Array länge: " + laufzeiten.length);
        // for schleife nur eingelesene werte ausgeben
        // Laufzeit: X ms
        for (int r = 0; r < laufzeiten.length; r++) {
            if (laufzeiten[r] > 0) {
                System.out.println("Laufzeit : " + laufzeiten[r] + " ms");
            }
        }

    }
}
