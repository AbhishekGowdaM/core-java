class LipstickBrand {
    public static void main(String[] args){
        String[] brands = {"Lakme", "Maybelline", "MAC", "Nykaa", "Sugar",
                           "Colorbar", "Faces", "Revlon", "Elle18", "Huda"
            };

        brands[2] = "Kylie";

        for (int pos = 0; pos < brands.length; pos++) {
            System.out.println(brands[pos]);
        }

        System.out.print("\n");

        for (int pos = brands.length - 1; pos >= 0; pos--) {
            System.out.println(brands[pos]);
        }

        System.out.print("\n");

        try {
            System.out.println(brands[20]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index does not exist");
        }
    }
}