import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        double ortalama = (mat + fizik + kimya + turkce + muzik) / 5;
        System.out.println(("Ortalamanız : ") + ortalama);

        if (ortalama < 55) {
            System.out.println("Sınıfı Geçemediniz");
        }else {
            System.out.println("Sınıfı Geçtiniz");
        }

    }

}