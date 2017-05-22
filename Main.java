import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println ("Podaj liczbe wierszy choinki: ");
        Scanner scanner = new Scanner(System.in);
        String h1;
        int height = 0;
        boolean flag = false;

        while (flag == false) {
            h1 = scanner.nextLine();
            flag = true;
            try {
                height = Integer.parseInt (h1);
            } catch(NumberFormatException e) {
                System.out.println ("Podano niepoprawna wartosc");
                flag = false;
            }
            if (flag == true) {
                if (height <=0 || height > 250) {
                    if (height <= 0) {
                        System.out.println("Choinka nie może mieć tak mało wierszy");
                    } else if (height > 250) {
                        System.out.println("Ooo, takiej ogromnej choinki to chyba nawet Mikolaj nie widzial. Moze cos mniejszego ?");
                    }
                    flag = false;
                }
            }
            if (flag == false) {
                System.out.println("Wpisz ponownie ilosc wierszy choinki:");
            }
        }

        Choinka ch = new Choinka();
        ch.choinka(height);
    }
}