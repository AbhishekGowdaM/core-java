class PersonRunner{
public static void main(String[] args) {

        String name = "Abhishek";
        String[] result = Person.getDetails(name);

        if(result != null){
            System.out.println("Length: " + result.length);

            for(String ref : result){
                System.out.println("Detail: " + ref);
            }
        }

        name = "Ravi";
        result = Person.getDetails(name);

        if(result != null){
            System.out.println("Length: " + result.length);

            for(String ref : result){
                System.out.println("Detail: " + ref);
            }
        }

        name = "Kiran";
        result = Person.getDetails(name);

        if(result != null){
            System.out.println("Length: " + result.length);

            for(String ref : result){
                System.out.println("Detail: " + ref);
            }
        }
    }
}