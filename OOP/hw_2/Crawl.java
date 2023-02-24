package OOP.hw_2;

public class Crawl {
    private final int distance;

    public Crawl(int distance) {
        this.distance = distance;
    }

    public boolean pass(CanCrawl canCrawl) {
        return canCrawl.getCrawl() >= distance;
    }
}
/*
 * public class SwimmingPoll {

    private final int distance;

    public SwimmingPoll(int distance) {
        this.distance = distance;
    }

    public boolean pass(CanSwim canSwim) {
        return canSwim.getSwim() >= distance;
    }
}
 */