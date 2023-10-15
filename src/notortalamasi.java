import java.util.Scanner;

public class notortalamasi {
    public static void main(String[] args) {

        //Değişkenleri atayalım
        int matematik, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfımızı yapalım
        Scanner inp = new Scanner(System.in);

        //Kullanıcı değerleriini alalım
        System.out.print("Matematik Notunuz: ");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        //Dersleri yazdık şimdi ortalamasını alalım
        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6.0;
        System.out.println(ortalama);

        //Koşullu sonucu yazdıralım
        String sonuc = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Not Ortalamanız: " + ortalama +  "  "  + sonuc );

    }
}