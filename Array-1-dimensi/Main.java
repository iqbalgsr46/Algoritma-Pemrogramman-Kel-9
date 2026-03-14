public class Main {
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
