class IPLTeam{

    String name;
    String captain;
    String coach;
    String homeGround;
    int titles;
    String owner;
    String city;
    int playersCount;
    String sponsor;
    int ranking;

    public IPLTeam(String name, String captain, String coach, String homeGround,
                   int titles, String owner, String city,
                   int playersCount, String sponsor, int ranking) {

        this.name = name;
        this.captain = captain;
        this.coach = coach;
        this.homeGround = homeGround;
        this.titles = titles;
        this.owner = owner;
        this.city = city;
        this.playersCount = playersCount;
        this.sponsor = sponsor;
        this.ranking = ranking;
    }
}