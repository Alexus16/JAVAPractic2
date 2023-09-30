public class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.printf("Юбка цвета %s размера %s(%s) стоимостью %d надета на женщину\n\r",
                super.getColor(),
                super.getSize().getEuroSize(),
                super.getSize().getDescription(),
                super.getCost());
    }
}
