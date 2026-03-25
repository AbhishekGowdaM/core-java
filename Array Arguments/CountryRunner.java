class CountryRunner {
    public static void main(String[] args) {

        String name = "India";
        String[] result = Country.getPresidents(name);

        if(result != null){
            System.out.println("Length: " + result.length);

            for(String ref : result){
                System.out.println("President: " + ref);
            }
        }

        name = "USA";
        result = Country.getPresidents(name);

        if(result != null){
            System.out.println("Length: " + result.length);

            for(String ref : result){
                System.out.println("President: " + ref);
            }
        }

        name = "France";
        result = Country.getPresidents(name);

        if(result != null){
            System.out.println("Length: " + result.length);

            for(String ref : result){
                System.out.println("President: " + ref);
            }
        }
    }
}