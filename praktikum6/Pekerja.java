package tugas.java;

class Pekerja extends Manusia {
    
    private String[] kantorCabang;
    private String[] departemen;
    String kantorfiks, departmenfiks;
    private String NIP;
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;

    Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jk, boolean menikah) {
        super(nama, NIK, jk, menikah);
        setJamKerja(jamKerja);
        setHariKerja(hariKerja);
        setNIP(NIP);

        kantorCabang = new String[7];
        kantorCabang[0] = "Mondstadt";
        kantorCabang[1] = "Liyue";
        kantorCabang[2] = "Inazuma";
        kantorCabang[3] = "Sumeru";
        kantorCabang[4] = "Fontaine";
        kantorCabang[5] = "Natlan";
        kantorCabang[6] = "Snezhnaya";

        departemen = new String[9];
        departemen[0] = "Pemasaran";
        departemen[1] = "Humas";
        departemen[2] = "Riset";
        departemen[3] = "Teknologi";
        departemen[4] = "Personalia";
        departemen[5] = "Akademik";
        departemen[6] = "Administrasi";
        departemen[7] = "Operasional";
        departemen[8] = "Pembangunan";
    }

    // setter
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    // getter
    public double getGaji() {
        this.gaji = getHariKerja() * getJamKerja() * 15;
        return this.gaji;
    }

    public double getBonus() {
        double libur;
        double lembur=0;

        int h = getHariKerja()/7;
        libur = h*2*getJamKerja()*20;

        if(getJamKerja()>7){
            int j = getJamKerja() - 7 ;
            lembur = (getHariKerja()-(h*2))*j*7;
        }
        this.bonus = libur + lembur;
        return this.bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public String getStatus() {
        char[] a = NIP.toCharArray();

        // untuk kantor cabang
        if (a[0] == '1'){
            kantorfiks = kantorCabang[0];

        } else if (a[0] == '2'){
            kantorfiks = kantorCabang[1];

        } else if (a[0] == '3'){
            kantorfiks = kantorCabang[2];

        } else if (a[0] == '4'){
            kantorfiks = kantorCabang[3];

        } else if (a[0] == '5'){
            kantorfiks = kantorCabang[4];

        } else if (a[0] == '6'){
            kantorfiks = kantorCabang[5];

        } else if (a[0] == '7'){
            kantorfiks = kantorCabang[6];

        } else {
            kantorfiks = "Tidak ada kantor cabang";
        }

        // untuk departemen
        if (a[6] == '1'){
            departmenfiks = departemen[0];

        } else if (a[6] == '2'){
            departmenfiks = departemen[1];

        } else if (a[6] == '3'){
            departmenfiks = departemen[2];

        } else if (a[6] == '4'){
            departmenfiks = departemen[3];

        } else if (a[6] == '5'){
            departmenfiks = departemen[4];

        } else if (a[6] == '6'){
            departmenfiks = departemen[5];

        } else if (a[6] == '7'){
            departmenfiks = departemen[6];

        } else if (a[6] == '8'){
            departmenfiks = departemen[7];

        } else if (a[6] == '9'){
            departmenfiks = departemen[8];

        } else {
            departmenfiks = "Tidak ada departemen";
        }

        return departmenfiks + ", " + kantorfiks + " cabang ke-" + a[2];
    }

    @Override
    public double getPendapatan() {
        // TODO Auto-generated method stub
        return super.getPendapatan() + getGaji() + getBonus();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nBonus\t\t\t: " + getBonus() + "$\nGaji\t\t\t: " + getGaji() + "$\nStatus\t\t\t: " + getStatus();
    }
}
