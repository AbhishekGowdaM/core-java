class GunModels{
    public static void main(String[] args){
        String[] guns ={"AK47", "M16", "Glock", "Desert Eagle", "MP5",
            "Uzi", "Famas", "Scar", "AKM", "Beretta", "Colt1911", "Ruger", 
			"Winchester", "Remington", "Mossberg", "Steyr", "SIG Sauer", 
			"Walther", "CZ75", "FN FAL","Dragunov", "Barrett M82", "Thompson",
			"Vector", "P90","G36", "M4 Carbine", "Tavor", "Galil", "Lee Enfield"   
        };

        guns[5] = "Uzi Pro";

        for (int pos = 0; pos < guns.length; pos++) {
            System.out.println(guns[pos]);
        }

        System.out.print("\n");

        for (int pos = guns.length - 1; pos >= 0; pos--) {
            System.out.println(guns[pos]);
        }

        System.out.print("\n");

        try {
            System.out.println(guns[50]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index does not exist");
        }
    }
}