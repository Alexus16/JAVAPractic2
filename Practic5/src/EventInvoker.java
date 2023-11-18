import java.util.LinkedList;

public class EventInvoker {
    private final LinkedList<EventListener> _listeners;

    public EventInvoker()
    {
        _listeners = new LinkedList<>();
    }

    public void AddListener(EventListener listener)
    {
        _listeners.add(listener);
    }

    public void Invoke()
    {
        for(var listener : _listeners)
        {
            listener.OnInvoked();
        }
    }
}
