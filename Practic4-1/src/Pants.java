public class Pants extends Clothes implements WomenClothing, MenClothing{

    public Pants(ClothSize size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Штаны цвета %s размера %s(%s) стоимостью %d надеты на мужчину\n\r",
                super.getColor(),
                super.getSize().getEuroSize(),
                super.getSize().getDescription(),
                super.getCost());
    }

    @Override
    public void dressWoman() {
        System.out.printf("Штаны цвета %s размера %s(%s) стоимостью %d надеты на женщину\n\r",
                super.getColor(),
                super.getSize().getEuroSize(),
                super.getSize().getDescription(),
                super.getCost());
    }
}
