import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int kalNaPorcje = 300;
        int kalNaCiastko = kalNaPorcje/4;

        System.out.println("Podaj liczbę zjedzonych ciastek: ");
        int liczbaCiastek = klawiatura.nextInt();

        System.out.println("Liczba skonsumowanych kalorii to: " + kalNaCiastko * liczbaCiastek );



    }
}
