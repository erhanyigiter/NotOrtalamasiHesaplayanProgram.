import java.util.Scanner;

public class notortalamasi {
    public static void main(String[] args) {
        // Değişkenleri atayalım
        int matematik, fizik, kimya, turkce, muzik;
        int toplamNot = 0;

        // Scanner sınıfını oluşturalım
        Scanner inp = new Scanner(System.in);

        // Kullanıcı değerlerini alalım ve hatalı girişi kontrol edelim
        System.out.print("Matematik Notunuz: ");
        matematik = inp.nextInt();
        if (matematik < 0 || matematik > 100) {
            System.out.println("Not sadece 0-100 aralığında olabilir! Notunuz ortalamaya dahil edilmeyecek!");
        } else {
            toplamNot += matematik;
        }

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Not sadece 0-100 aralığında olabilir! Notunuz ortalamaya dahil edilmeyecek!");
        } else {
            toplamNot += fizik;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Not sadece 0-100 aralığında olabilir! Notunuz ortalamaya dahil edilmeyecek!");
        } else {
            toplamNot += kimya;
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Not sadece 0-100 aralığında olabilir! Notunuz ortalamaya dahil edilmeyecek!");
        } else {
            toplamNot += turkce;
        }

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Not sadece 0-100 aralığında olabilir! Notunuz ortalamaya dahil edilmeyecek!");
        } else {
            toplamNot += muzik;
        }
            // Ortalamayı hesaplayalım
            double ortalama = (double) toplamNot / 5;

            // Koşullu sonucu yazdıralım
            String sonuc = (ortalama >= 55) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println("Not Ortalamanız: " + ortalama + "  " + sonuc);

        if (ortalama <55){
            System.out.print("Açıklama: Not ortalamanız 55'in altında olduğu için kaldınız, daha fazla çalışmalısınız.");
        }   else {
            System.out.print("Tebrikler!! Sınıf geçme koşulunu sağlıyorsunuz");
        }

    }
}
