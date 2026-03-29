class Satellite{

    String satelliteName = "INSAT";
    String orbitType = "Geostationary";
    int launchYear = 2020;
    double performanceLevel = 8.5;
    boolean isActive = true;

    String purpose;
    int altitudeKm;
    int lifespanYears;
    int signalFrequencyGHz;
    double satelliteWeight;
    boolean isGovernmentOwned;
    String launchVehicle;
    int warrantyYears;
    String originCountry;
    double maintenanceCost;

    public Satellite() {
        System.out.println("Satellite object created");
    }
}