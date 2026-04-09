class Acid{

    String name;
    String strength;
    int concentration;

    Acid(String name, String strength, int concentration) {
        this.name = name;
        this.strength = strength;
        this.concentration = concentration;
    }

    void displayAcid() {
        System.out.println("Acid Name : " + this.name);
        System.out.println("Strength : " + this.strength);
        System.out.println("Concentration : " + this.concentration);
    }
}