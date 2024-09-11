public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры напитков
        HotDrinkWithTemperature coffee = new HotDrinkWithTemperature("Кофе", 250, 75);
        HotDrinkWithTemperature tea = new HotDrinkWithTemperature("Чай", 300, 80);
        HotDrinkWithTemperature hotChocolate = new HotDrinkWithTemperature("Горячий шоколад", 200, 85);

        // Создаем торговый автомат
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();

        // Добавляем напитки в автомат
        vendingMachine.addProduct(coffee);
        vendingMachine.addProduct(tea);
        vendingMachine.addProduct(hotChocolate);

        // Ищем напиток
        HotDrinkWithTemperature selectedDrink = vendingMachine.getProduct("Чай", 300, 80);

        if (selectedDrink != null) {
            System.out.println("Вы выбрали: " + selectedDrink);
        } else {
            System.out.println("Такого напитка нет в автомате.");
        }
    }
}