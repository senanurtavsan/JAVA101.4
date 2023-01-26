import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner yaricap= new Scanner(System.in);

        System.out.print("Yarıçap Uzunluğunu Giriniz: ");
        int r=yaricap.nextInt();

        double Alan= 3.14 * r * r;
        double Cevre= (2 * 3.14 * r);


        System.out.println("Dairenin Alanı : " + Alan);
        System.out.println("Dairenin Çevresi : " + Cevre);

    }
}