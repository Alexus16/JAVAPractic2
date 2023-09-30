public abstract class Clothes {
    private ClothSize _size;
    private int _cost;
    private String _color;

    public Clothes(ClothSize size, int cost, String color)
    {
        this._color = color;
        this._cost = cost;
        this._size = size;
    }
    public ClothSize getSize()
    {
        return _size;
    }

    public int getCost()
    {
        return _cost;
    }

    public String getColor()
    {
        return _color;
    }
}
