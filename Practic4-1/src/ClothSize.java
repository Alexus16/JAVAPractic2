public enum ClothSize {
    XSS(32){
        public String getDescription()
        {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40),;

    private int _euroSize;
    ClothSize(int euroSize)
    {
        this._euroSize = euroSize;
    }

    public int getEuroSize()
    {
        return _euroSize;
    }

    public String getDescription()
    {
        return "Взрослый размер";
    }
}
