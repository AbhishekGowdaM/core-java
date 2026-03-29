class PhotoFrameRunner{
    public static void main(String[] args){

        PhotoFrame wallPhotoFrame = new PhotoFrame();
        PhotoFrame tablePhotoFrame = new PhotoFrame();
        PhotoFrame woodenPhotoFrame = new PhotoFrame();
        PhotoFrame glassPhotoFrame = new PhotoFrame();
        PhotoFrame sparePhotoFrame = new PhotoFrame();

        System.out.println("Default values:");

        System.out.println(wallPhotoFrame.material);
        System.out.println(wallPhotoFrame.color);
        System.out.println(wallPhotoFrame.price);
        System.out.println(wallPhotoFrame.size);
        System.out.println(wallPhotoFrame.available);

        System.out.println(tablePhotoFrame.material);
        System.out.println(tablePhotoFrame.color);
        System.out.println(tablePhotoFrame.price);
        System.out.println(tablePhotoFrame.size);
        System.out.println(tablePhotoFrame.available);

        System.out.println(woodenPhotoFrame.material);
        System.out.println(woodenPhotoFrame.color);
        System.out.println(woodenPhotoFrame.price);
        System.out.println(woodenPhotoFrame.size);
        System.out.println(woodenPhotoFrame.available);

        System.out.println(glassPhotoFrame.material);
        System.out.println(glassPhotoFrame.color);
        System.out.println(glassPhotoFrame.price);
        System.out.println(glassPhotoFrame.size);
        System.out.println(glassPhotoFrame.available);

        System.out.println(sparePhotoFrame.material);
        System.out.println(sparePhotoFrame.color);
        System.out.println(sparePhotoFrame.price);
        System.out.println(sparePhotoFrame.size);
        System.out.println(sparePhotoFrame.available);

        wallPhotoFrame.material = "Wood";
        wallPhotoFrame.color = "Brown";
        wallPhotoFrame.price = 500;
        wallPhotoFrame.size = 12;
        wallPhotoFrame.available = true;

        System.out.println("Updated values:");

        System.out.println(wallPhotoFrame.material);
        System.out.println(wallPhotoFrame.color);
        System.out.println(wallPhotoFrame.price);
        System.out.println(wallPhotoFrame.size);
        System.out.println(wallPhotoFrame.available);
    }
}