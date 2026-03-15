# Array 2 Dimensi


<!-- BOOTSTRAP ICONS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

<h1 align="center">
  <i class="bi bi-table"></i> Tugas Algoritma Pemrograman Array 2 Dimensi
  <br>
<hr>

### 🖇 Deskripsi Program
Program ini dibuat menggunakan bahasa pemrograman **Java** untuk menampilkan data mahasiswa menggunakan **array dua dimensi**.

Data yang ditampilkan terdiri dari:
- Nama
- NIM
- Kelas

Data tersebut disimpan dalam **array 2 dimensi** sehingga dapat diakses menggunakan indeks baris dan kolom. Program kemudian menampilkan data tersebut ke layar menggunakan **perulangan enhanced for loop** dan **printf** agar tampil rapi seperti tabel.

---

### 🖇 Konsep Yang Digunakan
Program ini menggunakan beberapa konsep dasar pemrograman, yaitu:

- **Array 2 Dimensi** untuk menyimpan data mahasiswa dalam bentuk tabel
- **Tipe data String** untuk menyimpan nama, NIM, dan kelas
- **Enhanced For Loop (for-each)** untuk membaca data dalam array
- **printf formatting** untuk menampilkan output agar rapi

---

### 📖 Penjelasan Program

#### 1. Membuat Array 2 Dimensi
```java
String[][] mahasiswa = {
    {"Nama", "NIM", "Kelas"},
    {"Tubagus Iqbal Husaeni", "312510036", "I253A"},
    {"Muhammad Rohid", "312510038", "I253A"},
    {"Fahri Muhammad Iyan", "312510050", "I253A"}
};
```

Kode di atas membuat **array dua dimensi** bernama `mahasiswa`.

Array ini berisi beberapa baris data yang menyerupai **tabel mahasiswa**.

| Nama | NIM | Kelas |
|-----|-----|-----|
| Tubagus Iqbal Husaeni | 312510036 | I253A |
| Muhammad Rohid | 312510038 | I253A |
| Fahri Muhammad Iyan | 312510050 | I253A |

Baris pertama digunakan sebagai **judul kolom**.

---

#### 2. Perulangan Enhanced For Loop
```java
for (String[] mahasiswa1 : mahasiswa)
```

Perulangan ini digunakan untuk membaca setiap baris dari array dua dimensi.

Penjelasan:
- `String[] mahasiswa1` → menyimpan satu baris data dari array
- `: mahasiswa` → membaca semua baris dalam array

Dengan cara ini, program akan mengambil data mahasiswa satu per satu.

---

#### 3. Menampilkan Data Menggunakan printf
```java
System.out.printf("%-25s %-12s %-10s%n", mahasiswa1[0], mahasiswa1[1], mahasiswa1[2]);
```

Fungsi `printf` digunakan untuk membuat tampilan output lebih rapi.

Penjelasan format:
- `%-25s` → teks rata kiri dengan lebar 25 karakter
- `%-12s` → teks rata kiri dengan lebar 12 karakter
- `%-10s` → teks rata kiri dengan lebar 10 karakter
- `%n` → pindah ke baris baru

---

### 💻 Source Code Program
```java
public class Main {
    public static void main(String[] args) {

        // Array 2 dimensi untuk menyimpan data mahasiswa
        String[][] mahasiswa = {
            {"Nama", "NIM", "Kelas"},
            {"Tubagus Iqbal Husaeni", "312510036", "I253A"},
            {"Muhammad Rohid", "312510038", "I253A"},
            {"Fahri Muhammad Iyan", "312510050", "I253A"}
        };

        // Menampilkan data mahasiswa
        for (String[] mahasiswa1 : mahasiswa) {
            System.out.printf("%-25s %-12s %-10s%n", mahasiswa1[0], mahasiswa1[1], mahasiswa1[2]);
        }
    }
}
```

---

### 🎯 Output Program
Program akan menampilkan tabel data mahasiswa seperti berikut:

```
Nama                      NIM          Kelas
Tubagus Iqbal Husaeni     312510036    I253A
Muhammad Rohid            312510038    I253A
Fahri Muhammad Iyan       312510050    I253A
```

---
