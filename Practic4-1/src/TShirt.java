public class TShirt extends Clothes implements WomenClothing, MenClothing {

    public TShirt(ClothSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Футболка цвета %s размера %s(%s) стоимостью %d надета на мужчину\n\r",
                super.getColor(),
                super.getSize().getEuroSize(),
                super.getSize().getDescription(),
                super.getCost());
    }

    @Override
    public void dressWoman() {
        System.out.printf("Футболка цвета %s размера %s(%s) стоимостью %d надета на женщину\n\r",
                super.getColor(),
                super.getSize().getEuroSize(),
                super.getSize().getDescription(),
                super.getCost());
    }
}
