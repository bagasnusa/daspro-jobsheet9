import java.util.Scanner;

public class ArrayRataNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rata2Lulus = 0;
        double rata2TidakLulus = 0;
        int jumlahLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }

        if (jumlahLulus > 0) {
            rata2Lulus = totalLulus / jumlahLulus;
            System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        if (jumlahMahasiswa - jumlahLulus > 0) {
            rata2TidakLulus = totalTidakLulus / (jumlahMahasiswa - jumlahLulus);
            System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
        } else {
            System.out.println("Semua mahasiswa lulus.");
        }

        
    }
}

