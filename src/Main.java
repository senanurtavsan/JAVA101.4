import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner abc= new Scanner(System.in);

        System.out.print("Yarıçap Uzunluğunu Giriniz: ");
        int r=abc.nextInt();

        double 𝜋=3.14;
        double Alan= 𝜋 * r * r;
        double Cevre= (2 * 𝜋 * r);


        System.out.print("Merkez Açısının ÖLçüsünü Gİriniz : ");
        double 𝛼= abc.nextDouble();

        double DdAlani=  (𝜋 * (r*r) * 𝛼) / 360;


        System.out.println("Dairenin Alanı : " + Alan);
        System.out.println("Dairenin Çevresi : " + Cevre);
        System.out.println("Daire Diliminin Alanı : " + DdAlani);

    }
}
