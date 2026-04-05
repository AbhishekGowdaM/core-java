class ArtMaterialRunner{
    public static void main(String[] args){

        ArtMaterial a1 = new ArtMaterial();
        a1.displayDetails();

        ArtMaterial a2 = new ArtMaterial("Camlin", "Paint", 150.0);
        a2.displayDetails();

        ArtMaterial a3 = new ArtMaterial("Faber", "Brush", 300.0);
        a3.displayDetails();

        ArtMaterial a4 = new ArtMaterial("Doms", "Sketch", 500.0, "MultiColor");
        a4.displayDetails();

        ArtMaterial a5 = new ArtMaterial("Classmate", "Crayons", 200.0, "Mixed");
        a5.displayDetails();
    }
}