import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkish,kimya,muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkish = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        double avarage = (mat + fizik + turkish + kimya + muzik) / 5;

        if (mat<0 || mat>100 || fizik<0 || fizik>100 ||
                turkish<0 || turkish>100 || kimya<0 ||
                kimya>100 || muzik<0 || muzik>100) {
            System.out.println("Yanlış değer girdiniz! Tekrar deneyein");
        }else if (avarage<55 ){
            System.out.println("Sınıfta kaldınız!.. Seneye gelin :) ");
            System.out.println("Ortalaman: " + avarage);
        }else {
            System.out.println("Sınıfı Geçtiniz!...");
            System.out.println("Ortalaman: " + avarage);
        }

    }
}