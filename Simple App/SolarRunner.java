class SolarRunner{
    public static void main(String[] args){

        SolarSystem solar = new SolarSystem();

        solar.addPlanet("Mercury");
        solar.addPlanet("Venus");
        solar.addPlanet("Earth");
        solar.addPlanet("Mars");
        solar.addPlanet("Jupiter");

        solar.addPlanet("Saturn");

        solar.searchPlanet("Earth");
        solar.searchPlanet("Saturn");
    }
}