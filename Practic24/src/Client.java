public class Client {
    private Chair _chair;

    public void setChair(Chair chair)
    {
        _chair = chair;
    }

    public void sit()
    {
        if(_chair != null) _chair.sitOnChair();
    }
}
