package modulDua;

//class Student yang berisi atribut dan method yang dimiliki oleh objek siswa
public class Student {

    //atribut-atribut yang dimiliki oleh objek siswa
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private static int jumlahObjek = 0;

    //constructor default 
    public Student(){
        //nilai default untuk name, address, dan age
        name = "";
        address = "";
        age = 0;
        //nilai default untuk nilai math, english, dan science
        mathGrade = 0;
        englishGrade = 0;
        scienceGrade = 0; 
        //untuk menambah nilai variable jumlahObjek setiap kali objek student dibuat
        jumlahObjek++;
    }

    //constructor dengan parameter
    public Student (String n, String a, int ag){
        //mengisi nilai attribute name, address, dan age 
        name = n;
        address = a;
        age = ag;
        //untuk menambah nilai variable jumlahObjek setiap kali objek student dibuat
        jumlahObjek++;
    }

    //contructor overloading dengan parameter yang berbeda
    public Student(String n, String a, int ag, double math, double english, double science){
        //mengisi nilai attribute name, address, age, mathGrade, englishGrade, dan scienceGrade 
        name = n;
        address = a;
        age = ag;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        //untuk menambah nilai variable jumlahObjek setiap kali objek student dibuat
        jumlahObjek++;
    }

    //constructor overloading dengan parameter yang berbeda, tanpa menambahkan jumlahObjek agar anna tidak terbaca 2 kali
    public Student(String a, int ag){
        //mengisi nilai attribute address, age
        address = a;
        age = ag;
    }

    //setter untuk mengubah nilai attribute name pada objek student
    public void setName(String n){
        name = n;
    }

    //setter untuk mengubah nilai attribute address pada objek student
    public void setAddress(String a){
        address = a;
    }

    //setter untuk mengubah nilai attribute age pada objek student
    public void setAge(int ag){
        age = ag;
    }

    //setter untuk mengubah nilai attribute mathgrade pada objek student
    public void setMath(int math){
        mathGrade = math;
    }

    //setter untuk mengubah nilai attribute englishgrade pada objek student
    public void setEnglish(int english){
        englishGrade = english;
    }

    //setter untuk mengubah nilai attribute sciencegrade pada objek student
    public void setScience(int science){
        scienceGrade = science;
    }

    //menghitung nilai rata-rata dari nilai math, english, dan science
    //getter Average digunakan untuk mengakses nilai rata-rata diluar class Student
    private double getAverage(){
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        return result;
    }

    //mengembalikan status siswa apakah lulus atau tidak, jika nilai rata- rata >=61 maka lulus dan jika nilai rata-rata <61 maka remidi
    public boolean statusAkhir(){
        return getAverage() >= 61;
    }

    //menampilkan informasi data siswa
    public void displayMessage(){
        System.out.println("Siswa dengan nama " + name );
        System.out.println("Beralamat di " + address);
        System.out.println("Berumur " + age);
        System.out.printf("Mempunyai nilai rata-rata %.2f\n", getAverage()); //agar nilai rata-rata ditampilkan 2 angka dibelakang koma
        System.out.println("Status : " +  (statusAkhir() ? "Lulus" : "Remidi"));//jika statusAkhir() bernilai true maka print lulus, jika bernilai false maka print remidi
        System.out.println("=================================");
        System.out.println();
    }

    //method untuk menampilkan jumlah objek siswa yang telah dibuat
    public static void jumlahObjek(){
        System.out.println("Jumlah objek siswa yang telah dibuat: " + jumlahObjek);

    }
}
