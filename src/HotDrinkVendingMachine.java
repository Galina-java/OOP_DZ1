import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrinkWithTemperature> products;

    public HotDrinkVendingMachine() {
        this.products = new ArrayList<>();
    }

    // Метод добавления напитков в автомат
    public void addProduct(HotDrinkWithTemperature product) {
        products.add(product);
    }

    // Реализация метода getProduct
    @Override
    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        for (HotDrinkWithTemperature product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}
