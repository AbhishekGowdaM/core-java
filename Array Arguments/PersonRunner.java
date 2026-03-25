class PersonRunner{

    public static void main(String[] args) {

        String[] names = {
            "Abhishek","Ravi","Kiran","Manu","Arjun",
            "Rakesh","Suresh","Mahesh","Naveen","Ajay",
            "Vijay","Deepak","Rahul","Praveen","Karthik",
            "Sunil","Anil","Rohit","Harish","Ganesh"
        };

        for(String name : names){

            Person.getDetails(name);
        }
    }
}