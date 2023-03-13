public class GPSEmpfangTesttreiber {
    public static void main (String [] args) {
        int [] Array = new int[5];
        System.out.println("Array länge: " + Array.length);

        GPSEmpfang.einlesenLaufzeiten(Array);
    }
}
