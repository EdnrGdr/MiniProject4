import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        // Dik ücgenin hipotenüsünü bulma projesi.

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Please Enter a ! .. : ");
        a = scanner.nextInt();
        System.out.print("Please Enter b !.. :");
        b= scanner.nextInt();

        double h = Math.sqrt(a * a + b * b);  //Math.sqrt     Math kütüphanesinden sqrt kullanırsak parantez içinin karakökünü al demek :)
        System.out.println(" Hipotenus :" + h);





    }
}
