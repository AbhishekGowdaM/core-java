class PhotoFrameRunner{
    public static void main(String[] args) {

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