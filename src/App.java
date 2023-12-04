import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // Skapa en Scanner för att läsa inmatning från tangentbordet.
        Scanner scanner = new Scanner(System.in);

        // Be användaren att ange det ursprungliga talet.
        System.out.print("Ange det ursprungliga heltalet: ");
        int ursprungligtTal = scanner.nextInt();

        // Utför de tilldelande aritmetiska operationerna enligt gåtan.
        int resultat = ursprungligtTal;
        resultat += 7;
        resultat *= 2;
        resultat -= 6;
        resultat /= 2;
        resultat += 3;
        resultat -= ursprungligtTal;

        // Skriv ut resultatet och se om det är 7 enligt gåtan.
        System.out.println("Resultatet efter att ha följt gåtan: " + resultat);

        if (resultat == 7) {
            System.out.println("Påståendet är sant!");
        } else {
            System.out.println("Påståendet är inte sant.");
        }





    }
}
