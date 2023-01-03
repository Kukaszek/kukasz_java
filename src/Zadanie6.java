public class Zadanie6 {
    public static void main(String[] args) {
        int pom1 = 3*4;
        int pom2 = 2*3;
        int pom3 = 2*2;
        int liczbaOsob = 4;

        int powCal = pom1 *2 + pom2 + pom3;
        double powNaOsobe = (double)powCal/liczbaOsob;
        System.out.println("Powierzchnia przypadająca na jedną osobę to: " + powNaOsobe);
    }
}
