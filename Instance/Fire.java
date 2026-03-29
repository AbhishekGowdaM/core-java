class Fire{

    String fireType = "Campfire";
    String fuelType = "Wood";
    int temperature = 600;
    double intensityLevel = 7.5;
    boolean producesSmoke = true;

    String flameColor;
    int fireHeight;
    int fireWidth;
    int fireSpreadRadius;
    double fireDuration;
    boolean isControlled;
    String locationType;
    int safetyRating;
    String originSource;
    double damageLevel;

    public Fire() {
        System.out.println("Fire object created");
    }
}