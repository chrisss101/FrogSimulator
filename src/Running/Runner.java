package Running;
import Setup.FrogSim;

public class Runner {
    public static void main(String[] args) {
        FrogSim Frog1 = new FrogSim(35, 8);
        FrogSim Frog2 = new FrogSim(20, 5);
        FrogSim Frog3 = new FrogSim(45, 7);
        FrogSim.hopDistance(2);

        System.out.println("Frog1 success rate:" + Frog1.runSimulations(6));
        System.out.println("Frog2 success rate:" + Frog2.runSimulations(6));
        System.out.println("Frog3 success rate:" + Frog3.runSimulations(6));
    }
}
