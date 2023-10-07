public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[] {
                new TShirt(ClothSize.L, 999, "зелёный"),
                new Skirt(ClothSize.S, 1499, "чёрный"),
                new Pants(ClothSize.M, 799, "белый"),
                new Tie(ClothSize.XXS, 299, "жёлтый"),
        };

        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        atelier.dressWoman(clothes);
    }
}