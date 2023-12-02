public class MagicChair implements Chair{

    private String _message;
    public MagicChair(String message)
    {
        _message = message;
    }

    public void sitOnChair() {
        System.out.println("Magiiiic");
        doMagic();
    }

    public void doMagic()
    {
        System.out.println(_message);
    }
}
