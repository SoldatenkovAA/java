package OOP.hw_2;

public class SwimmingPoll {

    private final int distance;

    public SwimmingPoll(int distance) {
        this.distance = distance;
    }

    public boolean pass(CanSwim canSwim) {
        return canSwim.getSwim() >= distance;
    }
}


/* copy before my homework
 * package OOP.hw_2;

public class SwimmingPoll implements Obstacle {

    private final int distance;

    public SwimmingPoll(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean pass(Participant participant) {
        return participant.getSwim() >= distance;
    }
}
 */