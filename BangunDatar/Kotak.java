package praktikum11.BangunDatar;

public class Kotak extends BangunDatar implements Resizeable {
    int panjang, lebar;

    public Kotak(int sisi, int panjang, int lebar) {
        super(sisi);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void draw() {

    }

    @Override
    public int getJumlahSisi() {
        return this.getJumlahSisi();
    }

    @Override
    public double getLuas() {
        return this.panjang * this.lebar;
    }

    @Override
    public double getKeliling() {
        return (this.panjang * 2) + (this.lebar * 2);
    }

    @Override
    public void resize(double x) {
        this.panjang = (int) (this.panjang * x);
        this.lebar  = (int) (this.lebar * x);
    }
}