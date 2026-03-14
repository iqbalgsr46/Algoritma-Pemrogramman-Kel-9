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
