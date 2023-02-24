package OOP.hw_2;

public class CrawlObstacleAdapter implements Obstacle{
    private final Crawl crawl;

    public CrawlObstacleAdapter(Crawl crawl) {
        this.crawl = crawl;
    }

    @Override
    public boolean pass(Participant participant) {
        return crawl.pass(participant);
    }
}


/*
 * public class SwimObstacleAdapter implements Obstacle {
    private final SwimmingPoll swimmingPoll;

    public SwimObstacleAdapter(SwimmingPoll swimmingPoll) {
        this.swimmingPoll = swimmingPoll;
    }

    @Override
    public boolean pass(Participant participant) {
        return swimmingPoll.pass(participant);
    }
}

 */