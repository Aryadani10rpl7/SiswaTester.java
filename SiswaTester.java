// Driver Class

import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Nama Siswa:");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa:");
        int id = input.nextInt();
        System.out.println("Inputkan IPK:");
        double ipk = input.nextDouble();

        Siswa gilam = new Siswa(id,nama,ipk);
        gilam.print();
        // object
        // Class object = new Constructor
        Siswa arjuna = new Siswa(123,"arjuna",90.0);
        Siswa matt = new Siswa(123,"matt", 90.0);
        Siswa evan = new Siswa(123,"evan",90.0);
        Siswa rehan = new Siswa(123,"rehan",90.0);
        Siswa ryuichi = new Siswa(123,"ryuichi",90.0);
        
        matt.id = 20;
        matt.nama = "Matthew";
        matt.ipk = 90;

        System.out.println(matt.id);
        System.out.println(matt.nama);
        System.out.println(matt.ipk);

        arjuna.id = 1;
        arjuna.nama = "Arjuna";
        arjuna.ipk = 90;

        System.out.println(arjuna.id);
        System.out.println(arjuna.nama);
        System.out.println(arjuna.ipk);

        evan.id = 10;
        evan.nama = "Evan";
        evan.ipk = 90;

        System.out.println(evan.id);
        System.out.println(evan.nama);
        System.out.println(evan.ipk);

        rehan.id = 11;
        rehan.nama = "rehan";
        rehan.ipk = 90;

        System.out.println(rehan.id);
        System.out.println(rehan.nama);
        System.out.println(rehan.ipk);

        ryuichi.id = 32;
        ryuichi.nama = "Ryu";
        ryuichi.ipk = 90;

        System.out.println(ryuichi.id);
        System.out.println(ryuichi.nama);
        System.out.println(ryuichi.ipk);

        matt.print();                                                                                                                                                                                                                                                
        arjuna.print();
        evan.print();
        rehan.print();
        ryuichi.print();
       input.close();
    }
}
