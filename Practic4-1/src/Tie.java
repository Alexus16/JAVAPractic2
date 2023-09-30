public class Tie extends Clothes implements MenClothing {
    public Tie(ClothSize size, int cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressMan() {
        System.out.printf("Галстук цвета %s размера %s(%s) стоимостью %d надет на мужчину\n\r",
                super.getColor(),
                super.getSize().getEuroSize(),
                super.getSize().getDescription(),
                super.getCost());
    }
}
