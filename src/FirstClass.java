public class FirstClass {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) throws InterruptedException {


        Pilot p1 = new Pilot("Carlos da Silva", "Corolla XEI 2008", 0);
        Pilot p2 = new Pilot("Camilo", "Mitsubishi Lancer", 0);
        Pilot p3 = new Pilot("Thiago Yamamoto", "Ferrari Diablo", 0);
        Pilot p4 = new Pilot("Guedes", "Bugatti Divo", 0);
        Race race = new Race();

        race.racingPilots[0] = p1;
        race.racingPilots[1] = p2;
        race.racingPilots[2] = p3;
        race.racingPilots[3] = p4;
        while (true) {
            race.lastWinner = race.startRace(race.racingPilots);
            race.lastWinner.totalWins++;
            System.out.println("Ganhador da última corrida: " + race.lastWinner.name + "\nTotal de vitórias: " + race.lastWinner.name);
            System.out.println(RED + "====================================" + RESET);
            race.printAllWins();
            System.out.println(RED + "====================================" + RESET);

            if (race.lastWinner.totalWins >= 3) {
                System.out.println(PURPLE + "CHAMPIONSHIP WINNER!!!");
                break;
            }
            Thread.sleep(5000);
        }
    }
}
