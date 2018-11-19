package Setup;

public class FrogSim {
    private int goalDistance;
    private int maxHops;
    private int moved;
    private int hopDist;
    public FrogSim(int dist,int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }
    private void hopDistance(int hop) {
        hopDist = hop;

    }
    public boolean simulate() {
        for (int i = maxHops; i >0; i--) {
           moved += hopDist;
        }
        if (moved >= goalDistance) {
            return true;
        }
        else {
            return false;
        }
    }

    public double runSimulations(int num){
        int winnum = 0;
        int failnum = 0;
        for (int i = num; i > 0; i--) {
            if (simulate()) {
                winnum++;
            }
            else {
                failnum += .1;
            }
        }
        int displayed = winnum + failnum;
        return displayed;

    }
}
