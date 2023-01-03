import java.util.Scanner;
public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj nazwę ulubionego miasta: ");
        String ulubMiasto = klawiatura.nextLine();

        int dlugosc = ulubMiasto.length();
        String duzeMiasto = ulubMiasto.toUpperCase();
        String maleMiasto = ulubMiasto.toLowerCase();
        char inicjal = ulubMiasto.charAt(0);
        System.out.println(dlugosc + "\n" + duzeMiasto + "\n" + maleMiasto + "\n" + inicjal);


    }
}
