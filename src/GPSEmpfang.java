import java.util.Scanner;
public class GPSEmpfang {
    public static int ausgabewert = 0;
    public static void einlesenLaufzeiten(int laufzeiten[]) {
        int zwischenspeicherEinlesen;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Werte Eingeben: ");
        for (int e = 0; e < laufzeiten.length;) {
            zwischenspeicherEinlesen = scanner.nextInt();
            if (zwischenspeicherEinlesen >= 80 && zwischenspeicherEinlesen <= 130) {
                laufzeiten[e] = zwischenspeicherEinlesen;
                e++;
            } else {
                System.out.println("falsche eingabe " + e);
            }
        }
        // Testwerte:
        //laufzeiten = new int[]{6,3,45,23,54};

        // nur werte zwischen 80 und 130 inclusive randwerte
        // if -1 exit oder array voll
        System.out.println("einlesen Array länge: " + laufzeiten.length);

        GPSEmpfang.ausgeben(laufzeiten);

    }
    public static void ausgeben(int laufzeiten[]) {
        System.out.println("ausgeben Array länge: " + laufzeiten.length);
        // for schleife nur eingelesene werte ausgeben
        // Laufzeit: X ms
        for (int r : laufzeiten) {
            System.out.println("Laufzeit : " + r + "ms");
        }
    }
}
