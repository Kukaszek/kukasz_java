import java.util.Scanner;
public class Zadanie8 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj szerokość pierwszego pokoju:");
        int szer1 = klawiatura.nextInt();
        System.out.println("Podaj długość pierwszego pokoju:");
        int dlug1 = klawiatura.nextInt();
        System.out.println("Podaj szerokość drugiego pokoju:");
        int szer2 = klawiatura.nextInt();
        System.out.println("Podaj długość drugiego pokoju:");
        int dlug2 = klawiatura.nextInt();
        System.out.println("Podaj szerokość trzeciego pokoju:");
        int szer3 = klawiatura.nextInt();
        System.out.println("Podaj długość trzeciego pokoju:");
        int dlug3 = klawiatura.nextInt();
        System.out.println("Podaj szerokość czwartego pokoju:");
        int szer4 = klawiatura.nextInt();
        System.out.println("Podaj długość czwartego pokoju:");
        int dlug4 = klawiatura.nextInt();

        int pom1 = szer1*dlug1;
        int pom2 = szer2*dlug2;
        int pom3 = szer3*dlug3;
        int pom4 = szer4*dlug4;
        int liczbaOsob = 4;

        int powCal = pom1 + pom2 + pom3 + pom4;
        double powNaOsobe = (double)powCal/liczbaOsob;
        System.out.println("Powierzchnia przypadająca na jedną osobę to: " + powNaOsobe);
    }
}
