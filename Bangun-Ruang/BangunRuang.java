package bangunruang;

import java.util.Scanner;

public class BangunRuang {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int pilihan;
            char ulang;
            
            do {
                System.out.println("===== PROGRAM MENGHITUNG VOLUME BANGUN RUANG =====");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Tabung");
                System.out.println("4. Kerucut");
                System.out.println("5. Bola");
                System.out.print("Pilih bangun ruang (1-5): ");
                pilihan = input.nextInt();
                
                switch (pilihan) {
                    
                    case 1 -> {
                        double sisi, volumeKubus;
                        System.out.print("Masukkan sisi kubus: ");
                        sisi = input.nextDouble();
                        volumeKubus = sisi * sisi * sisi;
                        System.out.println("Volume Kubus = " + volumeKubus);
                    }
                        
                    case 2 -> {
                        double panjang, lebar, tinggi, volumeBalok;
                        System.out.print("Masukkan panjang: ");
                        panjang = input.nextDouble();
                        System.out.print("Masukkan lebar: ");
                        lebar = input.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        tinggi = input.nextDouble();
                        volumeBalok = panjang * lebar * tinggi;
                        System.out.println("Volume Balok = " + volumeBalok);
                    }
                        
                    case 3 -> {
                        double r, t, volumeTabung;
                        double phi = 3.14;
                        System.out.print("Masukkan jari-jari: ");
                        r = input.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        t = input.nextDouble();
                        volumeTabung = phi * r * r * t;
                        System.out.println("Volume Tabung = " + volumeTabung);
                    }
                        
                    case 4 -> {
                        double r2, t2, volumeKerucut;
                        double phi2 = 3.14;
                        System.out.print("Masukkan jari-jari: ");
                        r2 = input.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        t2 = input.nextDouble();
                        volumeKerucut = (1.0/3) * phi2 * r2 * r2 * t2;
                        System.out.println("Volume Kerucut = " + volumeKerucut);
                    }
                        
                    case 5 -> {
                        double r3, volumeBola;
                        double phi3 = 3.14;
                        System.out.print("Masukkan jari-jari: ");
                        r3 = input.nextDouble();
                        volumeBola = (4.0/3) * phi3 * r3 * r3 * r3;
                        System.out.println("Volume Bola = " + volumeBola);
                    }
                        
                    default -> System.out.println("Pilihan tidak tersedia.");
                }
                
                System.out.print("\nHitung lagi? (y/n): ");
                ulang = input.next().charAt(0);
                
                System.out.println();
                
            } while (ulang == 'y' || ulang == 'Y');
            
            System.out.println("Program selesai.");
        }
    }
}