public class ThrowsDemo {
    public void printMessage(String key)
    {
        String msg = "";
        try
        {
            msg = getDetails(key);
        }
        catch(NullPointerException e)
        {
            msg = e.getMessage();
        }
        finally {
            System.out.println(msg);
        }
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails" );
        }
        return String.format("Key: %s\n\r", key);
    }
}
