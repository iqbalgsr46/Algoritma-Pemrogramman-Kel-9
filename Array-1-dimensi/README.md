# Array 1 Dimensi
Author : Tubagus Iqbal Husaeni

<!-- BOOTSTRAP ICONS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

<h1 align="center">
  <i class="bi bi-journal-code"></i> Tugas Algoritma Pemrograman Array 1 Dimensi  
  <br>
<hr>

### 🖇 Deskripsi Program
Program ini dibuat menggunakan bahasa pemrograman **Java** untuk menampilkan data mahasiswa yang terdiri dari **Nama, NIM, dan Nilai** menggunakan **array satu dimensi**.

Dalam program ini terdapat 3 mahasiswa, yaitu:
- Tubagus Iqbal Husaeni
- Muhammad Rohid
- Fahri Muhammad Iyan

Setiap mahasiswa memiliki **NIM dan nilai masing-masing** yang disimpan di dalam array.

---

### 🖇 Konsep Yang Digunakan
Program ini menggunakan beberapa konsep dasar pemrograman, yaitu:

- **Array 1 Dimensi** untuk menyimpan data nama, NIM, dan nilai mahasiswa
- **Tipe data String** untuk menyimpan nama dan NIM
- **Tipe data int** untuk menyimpan nilai
- **Perulangan (for)** untuk menampilkan seluruh data mahasiswa

---

### 📖 Penjelasan Program

#### 1. Membuat array nama
```
String[] nama = {"Tubagus Iqbal Husaeni", "Muhammad Rohid", "Fahri Muhammad Iyan"};
```

Baris kode ini digunakan untuk membuat **array bernama `nama`** yang berisi tiga data bertipe **String**, yaitu nama mahasiswa.

Isi array:
- indeks 0 → Tubagus Iqbal Husaeni
- indeks 1 → Muhammad Rohid
- indeks 2 → Fahri Muhammad Iyan

---

#### 2. Membuat array NIM
```
String[] nim = {"312510036", "312510038", "312510050"};
```

Array ini digunakan untuk menyimpan **NIM mahasiswa**.  
Setiap NIM sesuai dengan mahasiswa pada indeks yang sama di array `nama`.

Contoh:
- Tubagus Iqbal Husaeni → 312510036
- Muhammad Rohid → 312510038
- Fahri Muhammad Iyan → 312510050

---

#### 3. Membuat array nilai
```
int[] nilai = {95, 90, 88};
```

Array ini digunakan untuk menyimpan **nilai mahasiswa** dengan tipe data **integer**.

Isi array:
- Tubagus Iqbal Husaeni → 95
- Muhammad Rohid → 90
- Fahri Muhammad Iyan → 88

---

#### 4. Perulangan for
```
for(int i = 0; i < nama.length; i++){
```

Perulangan ini digunakan untuk **menampilkan semua data yang ada di dalam array**.

Penjelasan:
- `int i = 0` → perulangan dimulai dari indeks pertama
- `i < nama.length` → perulangan berjalan selama masih ada data dalam array
- `i++` → setiap perulangan nilai `i` akan bertambah satu

Dengan cara ini, program dapat menampilkan semua data mahasiswa secara otomatis tanpa harus menulis `System.out.println` satu per satu.

---

### 💻 Source Code Program
```java
public class SatuDimensi_1 {
    public static void main(String[] args) {
        
        // Array untuk menyimpan nama mahasiswa
        String[] nama = {"Tubagus Iqbal Husaeni", "Muhammad Rohid", "Fahri Muhammad Iyan"};

        // Array untuk menyimpan NIM mahasiswa
        String[] nim = {"312510036", "312510038", "312510050"};

        // Array untuk menyimpan nilai mahasiswa
        int[] nilai = {95, 90, 88};

        // Perulangan untuk menampilkan data mahasiswa
        for(int i = 0; i < nama.length; i++) {

            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama  : " + nama[i]);
            System.out.println("NIM   : " + nim[i]);
            System.out.println("Nilai : " + nilai[i]);
            System.out.println("----------------------");
           
        }
    }
}
```

---

### 🎯 Output Program
Program akan menampilkan data mahasiswa seperti berikut:

```
Data Mahasiswa ke-1
Nama  : Tubagus Iqbal Husaeni
NIM   : 312510036
Nilai : 95
----------------------

Data Mahasiswa ke-2
Nama  : Muhammad Rohid
NIM   : 312510038
Nilai : 90
----------------------

Data Mahasiswa ke-3
Nama  : Fahri Muhammad Iyan
NIM   : 312510050
Nilai : 88
----------------------
```