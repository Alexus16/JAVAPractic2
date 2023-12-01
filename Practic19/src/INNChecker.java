public class INNChecker {
    private final int[] coefs1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
    private final int[] coefs2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};

    public void ensureINNCorrect(String iNN) throws INNFormatException
    {
        if(!checkINN(iNN)) throw new INNFormatException();
    }
    public boolean checkINN(String iNN)
    {
        if(iNN.length() < 11 || iNN.length() > 12) return false;
        if(!checkControlNum1(iNN)) return false;
        if(iNN.length() == 12 && !checkControlNum2(iNN)) return false;
        return true;
    }

    private boolean checkControlNum1(String iNN)
    {
        int controlSum = 0;
        for(int i = 0; i < 10; i++)
        {
            controlSum += coefs1[i] * Integer.parseInt("" + iNN.charAt(i));
        }
        int controlNum1 = (controlSum % 11) % 10;
        int testNum = Integer.parseInt(iNN.charAt(10) + "");
        return testNum == controlNum1;
    }

    private boolean checkControlNum2(String iNN)
    {
        int controlSum = 0;
        for(int i = 0; i < 11; i++)
        {
            controlSum += coefs2[i] * Integer.parseInt("" + iNN.charAt(i));
        }
        int controlNum2 = (controlSum % 11) % 10;
        int testNum = Integer.parseInt(iNN.charAt(11) + "");
        return testNum == controlNum2;
    }
}
