public class Main {
    public static void main(String[] args) {
        Client youngWitch = new Client();
        Client oldMan = new Client();
        Client engineer = new Client();

        AbstractChairFactory factory = new ChairFactory();
        youngWitch.setChair(factory.createMagicChair());
        oldMan.setChair(factory.createVictorianChair());
        engineer.setChair(factory.createFunctionalChair());

        youngWitch.sit();
        oldMan.sit();
        engineer.sit();
    }
}