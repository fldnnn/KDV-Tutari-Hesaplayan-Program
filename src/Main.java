import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdv1 = 0.18, kdv2 = 0.08, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("ücreti giriniz: ");
        tutar = input.nextDouble();

        if (tutar > 0 && tutar < 1000) {
            kdvTutar = tutar * kdv1;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'SİZ TUTAR: " + tutar);
            System.out.println("KDV ORANI:" + kdv1);
            System.out.println("KDV TUTARI: " + kdvTutar);
            System.out.println("KDVLİ TUTAR: " + kdvliTutar);
        } else if (tutar >= 1000) {
            kdvTutar = tutar * kdv2;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV'SİZ TUTAR: " + tutar);
            System.out.println("KDV ORANI:" + kdv2);
            System.out.println("KDV TUTARI: " + kdvTutar);
            System.out.println("KDVLİ TUTAR: " + kdvliTutar);
        }
    }
}
