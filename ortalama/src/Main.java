import java.util.Scanner;
public class Main {

    public static void main (String args []) {
        int mat, fizik, kimya, tr, biyoloji, tarih;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuz:");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz:");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz:");
        tr = inp.nextInt();

        System.out.println("Biyoloji Notunuz");
        biyoloji = inp.nextInt();

        System.out.println("Tarih Notunuz:");
        tarih = inp.nextInt();

        int toplam = (mat + fizik + kimya + biyoloji + tarih);
        double sonuc = toplam / 6;

        System.out.println("Ortalamanız" + sonuc);
    }



}
