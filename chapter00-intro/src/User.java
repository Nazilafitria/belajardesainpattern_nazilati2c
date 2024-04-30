// USER
public class User{
    public String name;
    public String email;
    public String alamat;
    public String no_hp;
    public int umur;
    public String password;
    public void setName (String a){
        name = a;
    }
}

// mahasiswa
class mahasiswa extends User {
    public String nim;
    public void getNim() {
        System.out.println(this.nim);
    }
}

//dosen
class dosen extends User{
    public String nip;
    public String nidn;
    public void getNip(){
        System.out.println(this.nip);
    }
}