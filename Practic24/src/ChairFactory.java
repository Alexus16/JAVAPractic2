public class ChairFactory implements AbstractChairFactory{

    public MagicChair createMagicChair() {
        return new MagicChair("This chair is making your wallet empty right... now");
    }

    public VictorianChair createVictorianChair() {
        return new VictorianChair(100);
    }

    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair(12, 1);
    }
}
