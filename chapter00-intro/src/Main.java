public class Main {
    public static void main(String[] args) {
        mahasiswa mahasiswa = new mahasiswa();
        mahasiswa.name = "Nazila Fitria";
        mahasiswa.nim = "2022573010032";
        System.out.println("Nama Mahasiswa :"+mahasiswa.name);
        System.out.println("NIM Mahasiswa :"+mahasiswa.nim);

        dosen dosen = new dosen();
        dosen.name = "Reza Zulman";
        dosen.nip = "1980178290310";
        System.out.println("Nama Dosen :"+dosen.name);
        System.out.println("NIP Dosen :"+dosen.nip);

        Pinguin pinguin = new Pinguin();
        pinguin.nama = "jilaa";
        pinguin.warna = "Putih";

        // Menampilkan informasi Pinguin
        System.out.println("Nama Pinguin: " + pinguin.nama);
        System.out.println("Warna Pinguin: " + pinguin.warna);
        pinguin.swim();
        System.out.println();

        // Membuat objek Elang
        Elang elang = new Elang();
        elang.nama = "garuda";
        elang.warna = "Coklat";

        // Menampilkan informasi Elang
        System.out.println("Nama Elang: " + elang.nama);
        System.out.println("Warna Elang: " + elang.warna);
        elang.terbang();

        Kendaraan.Sepeda spd=new  Kendaraan.Sepeda();
        spd.bergerak();
        spd.berhenti();

        Kendaraan.SepedaMotor mtr =new  Kendaraan.SepedaMotor();
        mtr.bergerak();
        mtr.berhenti();
    }
}

