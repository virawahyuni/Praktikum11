package praktikum11.BangunDatar;

public abstract class BangunDatar {
    private int x,y, jumlahSisi;
    public BangunDatar(int sisi) {
        this.jumlahSisi = sisi;
    }
    public void pindahkan(int a, int b)
    {
        x = a;
        y = b;
    }

    public abstract void draw();
    public abstract int getJumlahSisi();
    public abstract double getLuas();
    public abstract  double getKeliling();
}