package UH;

import java.util.Scanner;

public class kelulusan {
   public static void main(String[] args) {
        String hasil = " ";
        String outputNilai = " ";

        System.out.println("=====");
        System.out.println("Silahkan cek kelulusan Anda disini!");
        System.out.println("=====");
        System.out.println(" ");

        biodata.dataDiri();

        System.out.println("=====");
        System.out.println(" ");

        Scanner input = new Scanner(System.in);
        System.out.println("Apakah pernah mengikui organisasi? 1. Iya 2. Tidak  || cukup ketik angkanya!");
        int jawab = input.nextInt();

        System.out.println("Masukan nilai Ujian Akhir Anda: ");
        int nilai = input.nextInt();

        // nilai
        if (nilai >= 80) {
            outputNilai = "Selamat Anda lulus!";
        } else if (nilai < 80){
            outputNilai = "Anda tidak lulus.";
        }



        // organisasi
        switch (jawab) {
            case 1:
                hasil = "Anda mendapatkan nilai tambahan karena mengikuti organisasi!";
                break;
            case 2:
                hasil = "Anda tidak mendapatkan nilai tambahan karena tidak mengikuti organisasi.";
                break;
            default:
                break;
        }
        System.out.println(" ");

        biodata.prestasi();
        System.out.println("=====");

        System.out.println("Hai!");
        System.out.println(outputNilai +" dan "+hasil);


    } 
}
