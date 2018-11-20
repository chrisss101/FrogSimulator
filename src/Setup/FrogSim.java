package Setup;

public class FrogSim {
    private int goalDistance;
    private int maxHops;
    private int moved;
    public int reachValue = 0;

    public static int hopDist;
    public FrogSim(int dist,int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }
    public static void hopDistance(int hop) {
        hopDist = hop;

    }
    public void simulate() {
        for (int i = maxHops; i >0; i--) {
           moved += hopDist;
        }
        if (moved >= goalDistance) {
            reachValue = 1;
        }
        else {
            reachValue = 0;
        }
    }

    public double runSimulations(int num){
        double winnum = 0;
        double failnum = 0;
        for (int i = num; i > 0; i--) {
            simulate();
            if (reachValue == 1) {
                winnum++;
            }
            else {
                failnum += .1;
            }
        }
        return winnum + failnum;

    }
}
