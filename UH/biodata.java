package UH;

import java.util.Scanner;;

public class biodata{
    public static void main(String[] args) {
        
    }

    static void dataDiri(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama lengkap Anda: ");
        String nama = input.nextLine();
        
        System.out.print("Masukan kelas Anda: ");
        String kelas = input.next();
        
        System.out.print("Masukan nomor absen Anda: ");
        int absen = input.nextInt();
    }

    static void prestasi(){
        Scanner input = new Scanner(System.in);

        System.out.print("Organisasi yang pernah diikuti: ");
        String organ = input.nextLine();

    }
}
