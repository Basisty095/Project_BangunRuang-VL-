package Volume_BangunRuang;
import java.util.Scanner;

public class Volume_BangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        System.out.println("Pilih bangun ruang untuk menghitung volumenya:");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. tabung");
        System.out.println("4. Limas");
        System.out.println("5. Prisma Segitiga");
        System.out.print("Masukkan pilihan (1/2/3/4/5): ");
        
        pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisiKubus = input.nextDouble();
                double volumeKubus = sisiKubus * sisiKubus * sisiKubus;
                System.out.println("Volume kubus adalah: " + volumeKubus);
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                double panjangBalok = input.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebarBalok = input.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = input.nextDouble();
                double volumeBalok = panjangBalok * lebarBalok * tinggiBalok;
                System.out.println("Volume balok adalah: " + volumeBalok);
                break;
            case 3:
                System.out.print("Masukkan jari-jari tabung: ");
                double jariJari = input.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tinggiSilinder = input.nextDouble();
                double volumeSilinder = Math.PI * Math.pow(jariJari, 2) * tinggiSilinder;
                System.out.println("Volume tabung adalah: " + volumeSilinder);
                break;
            case 4:
                System.out.print("Masukkan luas alas limas: ");
                double luasAlasLimas = input.nextDouble();
                System.out.print("Masukkan tinggi limas: ");
                double tinggiLimas = input.nextDouble();
                double volumeLimas = (luasAlasLimas * tinggiLimas) / 3;
                System.out.println("Volume limas adalah: " + volumeLimas);
                break;
            case 5:
                System.out.print("Masukkan luas alas prisma segitiga: ");
                double luasAlasPrisma = input.nextDouble();
                System.out.print("Masukkan tinggi prisma segitiga: ");
                double tinggiPrisma = input.nextDouble();
                double volumePrisma = luasAlasPrisma * tinggiPrisma;
                System.out.println("Volume prisma segitiga adalah: " + volumePrisma);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}


