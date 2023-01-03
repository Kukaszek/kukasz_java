import java.util.Scanner;
public class Zadanie21 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj kwotę pieniędzy początkowo zdeponowanej na koncie: ");
        int pieniadzeNaKoncie = klawiatura.nextInt();
        System.out.println("Podaj roczną stopę oprocenowania: ");
        double rocznaStopa = klawiatura.nextDouble();
        System.out.println("Ile razy w roku odsetki będą kapitalizowane: ");
        int liczbaKapitalizacjiRocznie = klawiatura.nextInt();
        System.out.println("Liczba lat, przez jakie środki będą znajdować się na koncie i generować odsetki");
        int liczbaLat = klawiatura.nextInt();

        double kwotaPoLatach = pieniadzeNaKoncie* Math.pow(1 + rocznaStopa/liczbaKapitalizacjiRocznie, liczbaKapitalizacjiRocznie * liczbaLat );

        System.out.println("Kwota po latach to: " + kwotaPoLatach);

    }
}
