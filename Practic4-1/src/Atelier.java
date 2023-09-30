public class Atelier {
    public void dressWoman(Clothes[] clothes)
    {
        for(var cloth : clothes)
        {
            if(cloth instanceof WomenClothing)
            {
                ((WomenClothing) cloth).dressWoman();
            }
        }
    }

    public void dressMan(Clothes[] clothes)
    {
        for(var cloth : clothes)
        {
            if(cloth instanceof MenClothing)
            {
                ((MenClothing) cloth).dressMan();
            }
        }
    }
}
