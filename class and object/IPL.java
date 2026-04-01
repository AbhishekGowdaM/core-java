class IPL{

    int year;
    String sponsor;
    int totalTeams;
    String winner;
    String runnerUp;
    int totalMatches;
    String location;
    double prizeMoney;
    String bestPlayer;
    String bestBowler;

    public IPL(int year, String sponsor, int totalTeams, String winner,
               String runnerUp, int totalMatches, String location,
               double prizeMoney, String bestPlayer, String bestBowler) {

        this.year = year;
        this.sponsor = sponsor;
        this.totalTeams = totalTeams;
        this.winner = winner;
        this.runnerUp = runnerUp;
        this.totalMatches = totalMatches;
        this.location = location;
        this.prizeMoney = prizeMoney;
        this.bestPlayer = bestPlayer;
        this.bestBowler = bestBowler;
    }
}