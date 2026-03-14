# Program Bangun Ruang
Author : Tubagus Iqbal Husaeni

<!-- BOOTSTRAP ICONS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

<h1 align="center">
  <i class="bi bi-box"></i> Program Menghitung Volume Bangun Ruang
  <br>
<hr>

### 🖇 Deskripsi Program
Program ini dibuat menggunakan bahasa pemrograman **Java** untuk menghitung **volume beberapa bangun ruang**.  
Pengguna dapat memilih bangun ruang yang ingin dihitung melalui menu yang tersedia.

Bangun ruang yang tersedia dalam program ini adalah:

- Kubus
- Balok
- Tabung
- Kerucut
- Bola

Program akan meminta pengguna memasukkan nilai yang diperlukan seperti **sisi, panjang, lebar, tinggi, atau jari-jari**, kemudian menghitung dan menampilkan **volume bangun ruang** yang dipilih.

---

### 🖇 Konsep Yang Digunakan
Program ini menggunakan beberapa konsep dasar pemrograman Java, yaitu:

- **Scanner** untuk menerima input dari pengguna
- **Switch Case** untuk memilih jenis bangun ruang
- **Perulangan do-while** untuk mengulang program
- **Tipe data double** untuk menyimpan nilai perhitungan
- **Rumus matematika bangun ruang**

---

### 📖 Penjelasan Program

#### 1. Mengimpor Library Scanner
```java
import java.util.Scanner;
```

Library ini digunakan untuk mengambil input dari keyboard yang dimasukkan oleh pengguna.

---

#### 2. Membuat Menu Bangun Ruang
Program menampilkan beberapa pilihan bangun ruang yang dapat dihitung volumenya.

```java
System.out.println("1. Kubus");
System.out.println("2. Balok");
System.out.println("3. Tabung");
System.out.println("4. Kerucut");
System.out.println("5. Bola");
```

Pengguna kemudian memilih salah satu menu yang tersedia.

---

#### 3. Menggunakan Switch Case
Program menggunakan `switch` untuk menentukan perhitungan berdasarkan pilihan pengguna.

```java
switch (pilihan) {
```

Setiap pilihan akan menjalankan rumus volume bangun ruang yang berbeda.

---

#### 4. Rumus Volume Bangun Ruang

Beberapa rumus yang digunakan dalam program ini:

| Bangun Ruang | Rumus Volume |
|---------------|---------------|
| Kubus | V = s × s × s |
| Balok | V = p × l × t |
| Tabung | V = π × r² × t |
| Kerucut | V = 1/3 × π × r² × t |
| Bola | V = 4/3 × π × r³ |

---

#### 5. Perulangan Program
Program menggunakan **perulangan do-while** agar pengguna dapat menghitung volume bangun ruang lebih dari satu kali.

```java
do {
```

Setelah perhitungan selesai, pengguna dapat memilih apakah ingin mengulang program atau tidak.

---

### 💻 Source Code Program
```java
import java.util.Scanner;

public class BangunRuang {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
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

                case 1:
                    double sisi;

                    System.out.print("Masukkan sisi kubus: ");
                    sisi = input.nextDouble();

                    double volumeKubus = sisi * sisi * sisi;
                    System.out.println("Volume Kubus = " + volumeKubus);
                    break;

                case 2:
                    double panjang, lebar, tinggi;

                    System.out.print("Masukkan panjang: ");
                    panjang = input.nextDouble();

                    System.out.print("Masukkan lebar: ");
                    lebar = input.nextDouble();

                    System.out.print("Masukkan tinggi: ");
                    tinggi = input.nextDouble();

                    double volumeBalok = panjang * lebar * tinggi;
                    System.out.println("Volume Balok = " + volumeBalok);
                    break;

                case 3:
                    double r, t;
                    double phi = 3.14;

                    System.out.print("Masukkan jari-jari: ");
                    r = input.nextDouble();

                    System.out.print("Masukkan tinggi: ");
                    t = input.nextDouble();

                    double volumeTabung = phi * r * r * t;
                    System.out.println("Volume Tabung = " + volumeTabung);
                    break;

                case 4:
                    double r2, t2;
                    double phi2 = 3.14;

                    System.out.print("Masukkan jari-jari: ");
                    r2 = input.nextDouble();

                    System.out.print("Masukkan tinggi: ");
                    t2 = input.nextDouble();

                    double volumeKerucut = (1.0/3) * phi2 * r2 * r2 * t2;
                    System.out.println("Volume Kerucut = " + volumeKerucut);
                    break;

                case 5:
                    double r3;
                    double phi3 = 3.14;

                    System.out.print("Masukkan jari-jari: ");
                    r3 = input.nextDouble();

                    double volumeBola = (4.0/3) * phi3 * r3 * r3 * r3;
                    System.out.println("Volume Bola = " + volumeBola);
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

            System.out.print("\nHitung lagi? (y/n): ");
            ulang = input.next().charAt(0);

            System.out.println();

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Program selesai.");
        input.close();
    }
}
```

---

### 🎯 Contoh Output Program

```
===== PROGRAM MENGHITUNG VOLUME BANGUN RUANG =====
1. Kubus
2. Balok
3. Tabung
4. Kerucut
5. Bola
Pilih bangun ruang (1-5): 1

Masukkan sisi kubus: 5

Volume Kubus = 125

Hitung lagi? (y/n): n

Program selesai.
```

---