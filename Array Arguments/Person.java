class Person{

    static String[] getDetails(String name){

        System.out.println("Person details for: " + name);

        if(name == null){
            System.out.println("Invalid name");
            return null;
        }

        if(name == "Abhishek"){
            String[] details = {
                "Email: abhi@gmail.com",
                "Mobile: 9876543210",
                "PG: BTM PG",
                "Home: Mandya"
            };
            return details;
        }

        if(name == "Ravi"){
            String[] details = {
                "Email: ravi@gmail.com",
                "Mobile: 9876543211",
                "PG: Marathahalli PG",
                "Home: Mandya"
            };
            return details;
        }

        if(name == "Kiran"){
            String[] details = {
                "Email: kiran@gmail.com",
                "Mobile: 9876543212",
                "PG: Whitefield PG",
                "Home: Hassan"
            };
            return details;
        }

        if(name == "Manu"){
            String[] details = {
                "Email: manu@gmail.com",
                "Mobile: 9876543213",
                "PG: Electronic City PG",
                "Home: Tumkur"
            };
            return details;
        }

        if(name == "Arjun"){
            String[] details = {
                "Email: arjun@gmail.com",
                "Mobile: 9876543214",
                "PG: BTM PG",
                "Home: Bangalore"
            };
            return details;
        }

        if(name == "Rakesh"){
            String[] details = {
                "Email: rakesh@gmail.com",
                "Mobile: 9876543215",
                "PG: Indiranagar PG",
                "Home: Mysore"
            };
            return details;
        }

        if(name == "Suresh"){
            String[] details = {
                "Email: suresh@gmail.com",
                "Mobile: 9876543216",
                "PG: Hebbal PG",
                "Home: Tumkur"
            };
            return details;
        }

        if(name == "Mahesh"){
            String[] details = {
                "Email: mahesh@gmail.com",
                "Mobile: 9876543217",
                "PG: Yelahanka PG",
                "Home: Hassan"
            };
            return details;
        }

        if(name == "Naveen"){
            String[] details = {
                "Email: naveen@gmail.com",
                "Mobile: 9876543218",
                "PG: Whitefield PG",
                "Home: Mandya"
            };
            return details;
        }

        if(name == "Ajay"){
            String[] details = {
                "Email: ajay@gmail.com",
                "Mobile: 9876543219",
                "PG: BTM PG",
                "Home: Bangalore"
            };
            return details;
        }

        System.out.println("Person not found");
        return null;
    }
}