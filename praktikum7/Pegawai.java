package tugas.java;

public class Pegawai {
    
    private String nama;
    private String noKTP;

    Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    // getter
    public String getNama() {
        return this.nama;
    }

    public String getNoKTP() {
        return this.noKTP;
    }

    public double gaji(){
        return 0;
    }

    public String toString(){
        return " ";
    }
}
