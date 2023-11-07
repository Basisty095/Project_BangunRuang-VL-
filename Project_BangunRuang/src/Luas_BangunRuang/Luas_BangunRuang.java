package Luas_BangunRuang;
import java.util.Scanner;

public class Luas_BangunRuang {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        System.out.println("Pilih bangun ruang untuk menghitung luas permukaannya:");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. tabung");
        System.out.println("4. Limas");
        System.out.println("5. Prisma Segitiga");
        System.out.print("Masukkan pilihan (1/2/3/4/5): ");
        
        pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
                // Menghitung luas permukaan kubus
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisiKubus = input.nextDouble();
                double luasPermukaanKubus = 6 * Math.pow(sisiKubus, 2);
                System.out.println("Luas permukaan kubus adalah: " + luasPermukaanKubus);
                break;
            case 2:
                // Menghitung luas permukaan balok
                System.out.print("Masukkan panjang balok: ");
                double panjangBalok = input.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebarBalok = input.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = input.nextDouble();
                double luasPermukaanBalok = 2 * (panjangBalok * lebarBalok + panjangBalok * tinggiBalok + lebarBalok * tinggiBalok);
                System.out.println("Luas permukaan balok adalah: " + luasPermukaanBalok);
                break;
            case 3:
                // Menghitung luas permukaan tabung
                System.out.print("Masukkan jari-jari tabung: ");
                double jariJari = input.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tinggiSilinder = input.nextDouble();
                double luasPermukaanSilinder = 2 * Math.PI * jariJari * (jariJari + tinggiSilinder);
                System.out.println("Luas permukaan tabung adalah: " + luasPermukaanSilinder);
                break;
            case 4:
                // Menghitung luas permukaan limas
                System.out.print("Masukkan luas alas limas: ");
                double luasAlasLimas = input.nextDouble();
                System.out.print("Masukkan jumlah sisi tegak limas: ");
                int jumlahSisiTegak = input.nextInt();
                System.out.print("Masukkan panjang sisi limas: ");
                double panjangSisiLimas = input.nextDouble();
                double luasPermukaanLimas = luasAlasLimas + (jumlahSisiTegak * panjangSisiLimas * panjangSisiLimas) / 2;
                System.out.println("Luas permukaan limas adalah: " + luasPermukaanLimas);
                break;
            case 5:
                // Menghitung luas permukaan prisma segitiga
                System.out.print("Masukkan luas alas prisma segitiga: ");
                double luasAlasPrisma = input.nextDouble();
                System.out.print("Masukkan jumlah sisi tegak prisma: ");
                int jumlahSisiTegakPrisma = input.nextInt();
                System.out.print("Masukkan panjang sisi prisma: ");
                double panjangSisiPrisma = input.nextDouble();
                double luasPermukaanPrisma = luasAlasPrisma + (jumlahSisiTegakPrisma * panjangSisiPrisma);
                System.out.println("Luas permukaan prisma segitiga adalah: " + luasPermukaanPrisma);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
