package modulDua;
//untuk mengimport class scanner
import java.util.Scanner;

//class MainStudent yang berisi method main
public class MainStudent {

    //method main yang akan dijalankan pertama kali ketika program dijalankan
    public static void main(String[] args) {

        //membuat objek scanner untuk input data siswa dari user
        Scanner in = new Scanner(System.in);
        //meminta user untuk memasukkan jumlah siswa
        System.out.print("Masukan jumlah siswa:");
        int jumlahSiswa = in.nextInt();
        //membuat array untuk menyimpan data siswa
        Student[] students = new Student[jumlahSiswa];

        //membuat objek siswa sebanyak jumlah siswa yang diinputkan oleh user
        //menggunakan for untuk mengulang proses input data siswa sebanyak jumlah siswa yang diinputkan oleh user
        for(int i = 0; i < jumlahSiswa; i++){
            System.out.println("Masukan data siswa ke- " +(i + 1));   //meminta user memasukan data siswa
            System.out.print("Nama: ");
            String name = in.next();
            System.out.print("Alamat: ");
            String address = in.next(); 
            System.out.print("Umur: ");
            int age = in.nextInt();
            System.out.print("Nilai Matematika: ");
            double ma = in.nextDouble();
            System.out.print("Nilai Bahasa Inggris: ");
            double en = in.nextDouble();
            System.out.print("Nilai IPA: ");
            double sc = in.nextDouble();
            System.out.println();
            //membuat objek siswa dengan data yang diinputkan oleh user
            students[i] = new Student(name, address, age, ma, en, sc);
        }

        //mengeprint data seluruh siswa
        System.out.println("===========================");
        System.out.println("||  Data seluruh siswa:  ||" );
        System.out.println("===========================");
        System.out.println();

        // menampilkan data siswa yang telah diinputkan oleh user
        for(Student student : students){
            student.displayMessage();
        }

        //membuat objek siswa dengan nama anna dan mengisi data menggunakan setter
        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        //menampilkan data siswa anna
        anna.displayMessage();

        //menggunakan constructor lain 
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        //menampilkan data siswa chris
        chris.displayMessage();

        //menggunakan constructor lain
        Student gadis = new Student("Gadis", "Solo", 22, 98, 80, 89);
        //menampilkan data siswa gadis
        gadis.displayMessage();

        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor 
        anna = new Student ("Jakarta", 21); //memberi ulang nilai nama, math, english dan science karena membuat objek baru
        anna.setName("Anna");
        anna.setMath(100);
        anna.setEnglish(89);
        anna.setScience(80);
        //menampilkan data siswa anna yang telah diubah

        anna.displayMessage();

        //siswa dengan nama chris dirubah informasi alamat dan umurnya melalui method 
        chris.setAddress("Surabaya");
        chris.setAge(22);
        //menampilkan data siswa chris yang telah diubah
        chris.displayMessage();

        //memanggil method jumlahObjek() untuk mengetahui jumlah objek siswa yang telah dibuat
        Student.jumlahObjek();

        //menutup scanner
        in.close();
    }
}
