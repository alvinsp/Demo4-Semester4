import java.util.HashMap;
import java.util.Scanner;

/**
 * Latihan
 */
public class Latihan {

    String nama, kelas, matkulprakikum;
    int nim;

    public Latihan(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulprakikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Latihan> mhs = new HashMap<>();
        String input;
        Latihan data;

        mhs.put("1", new Latihan("Putri", "3H", "Struktur Data", 2021103));
        mhs.put("2", new Latihan("Agus", "3A", "Matematika", 2021104));
        mhs.put("3", new Latihan("Arro", "3D", "Pemrograman", 2021105));

        System.out.println("Masukkan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if(data != null){
            System.out.println("Data Mahasiswa : " + data.nama + " Kelas : "
            + data.kelas + " Matkul Prakikum : " + data.matkulprakikum + 
            ", NIM : " + data.nim);
        }
    }
}