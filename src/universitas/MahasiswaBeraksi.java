package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("2110010122", "Muhammad Sadam", "TI");
        
        System.out.println("NPM : " + mahasiswa1.getNPM());
        System.out.println("Nama : " + mahasiswa1.getNama());
        System.out.println("Prodi : " + mahasiswa1.getProdi());
    }
}
