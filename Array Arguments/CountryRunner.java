class CountryRunner{
public static void main(String[] args) {
        String[] countryList = {
            "India","USA","France","Japan","Germany",
            "Brazil","Canada","Australia","Italy","Spain",
            "Mexico","South Africa","Argentina","Turkey",
            "Saudi Arabia","Nepal","Sri Lanka","Bangladesh",
            "Pakistan","Indonesia","South Korea","Egypt",
            "Nigeria","Kenya","Ukraine","Poland","Sweden",
            "Norway","Denmark","Finland","Switzerland",
            "Belgium","Netherlands","New Zealand","Philippines","Vietnam"
        };

        for(String name : countryList){

            System.out.println("Country: " + name);

            String president = Country.getPresident(name);

            System.out.println("President: " + president);

        }
    }
}