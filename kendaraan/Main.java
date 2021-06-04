package praktikum11.kendaraan;

public class Main {
    public static void main(String[] args) {
        Motor motorMatic = new Motor(true);
        motorMatic.jenis();
        Motor motorManual = new Motor(false);
        motorManual.jenis();
    }
}

