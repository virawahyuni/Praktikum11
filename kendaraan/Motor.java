package praktikum11.kendaraan;

public class Motor {
    private boolean isAuto;
    public Motor(boolean isAuto) {
        this.isAuto = isAuto;
    }
    public void jenis() {
        System.out.println(isAuto == true ? "Motor Matic" : "Motor Manual");
    }
}
