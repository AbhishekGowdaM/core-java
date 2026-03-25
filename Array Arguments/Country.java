class Country {
static String[] getPresidents(String country){

        System.out.println("President details for: " + country);

        if(country == null){
            System.out.println("Invalid country");
            return null;
        }

        if(country == "India"){
            String[] presidents = {"Droupadi Murmu"};
            return presidents;
        }

        if(country == "USA"){
            String[] presidents = {"Joe Biden"};
            return presidents;
        }

        if(country == "France"){
            String[] presidents = {"Emmanuel Macron"};
            return presidents;
        }

        if(country == "Russia"){
            String[] presidents = {"Vladimir Putin"};
            return presidents;
        }

        if(country == "China"){
            String[] presidents = {"Xi Jinping"};
            return presidents;
        }

        if(country == "Germany"){
            String[] presidents = {"Frank-Walter Steinmeier"};
            return presidents;
        }

        if(country == "Brazil"){
            String[] presidents = {"Lula da Silva"};
            return presidents;
        }

        if(country == "Japan"){
            String[] presidents = {"Naruhito"};
            return presidents;
        }

        if(country == "Canada"){
            String[] presidents = {"Justin Trudeau"};
            return presidents;
        }

        if(country == "Australia"){
            String[] presidents = {"Anthony Albanese"};
            return presidents;
        }

        if(country == "Italy"){
            String[] presidents = {"Sergio Mattarella"};
            return presidents;
        }

        if(country == "Spain"){
            String[] presidents = {"Pedro Sánchez"};
            return presidents;
        }

        if(country == "Mexico"){
            String[] presidents = {"Andrés Manuel López Obrador"};
            return presidents;
        }

        if(country == "South Africa"){
            String[] presidents = {"Cyril Ramaphosa"};
            return presidents;
        }

        if(country == "Argentina"){
            String[] presidents = {"Javier Milei"};
            return presidents;
        }

        if(country == "Turkey"){
            String[] presidents = {"Recep Tayyip Erdoğan"};
            return presidents;
        }

        if(country == "Saudi Arabia"){
            String[] presidents = {"Salman"};
            return presidents;
        }

        if(country == "Nepal"){
            String[] presidents = {"Ram Chandra Poudel"};
            return presidents;
        }

        if(country == "Sri Lanka"){
            String[] presidents = {"Ranil Wickremesinghe"};
            return presidents;
        }

        if(country == "Bangladesh"){
            String[] presidents = {"Mohammed Shahabuddin"};
            return presidents;
        }

        System.out.println("Country not found");
        return null;
    }
}