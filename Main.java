/*
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double ucret, km;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç Kilometre Gidildi : ");
        km = inp.nextDouble();

        ucret = (10 + km*2.2);

        boolean sonuc = ucret>20;

        double tutar = sonuc ? ucret : 20;

        System.out.println("Taksimetre : "+ tutar +" TL");
    }
}