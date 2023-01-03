import java.util.Scanner;
public class Zadanie20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbę ciastek do upieczenia: ");
        int liczbaCiastek = klawiatura.nextInt();
        int ciastkaNaPorcje = 48;

        double cukierNaCiastko = 1.5/ciastkaNaPorcje;
        double masloNaCiastko = (double)1/ciastkaNaPorcje;
        double makaNaCiastko = 2.75/ciastkaNaPorcje;

        double cukierCaly = cukierNaCiastko * liczbaCiastek;
        double masloCale = masloNaCiastko * liczbaCiastek;
        double makaCale = makaNaCiastko * liczbaCiastek;
        System.out.println("Aby upiec " + liczbaCiastek + " ciastek potrzeba "+ cukierCaly +" szlanek cukru, " + masloCale + " szklanek masła i " + makaCale + "szklanek maki." );

    }
}
