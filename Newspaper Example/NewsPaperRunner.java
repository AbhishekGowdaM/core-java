class NewsPaperRunner{
    public static void main(String[] args) {

        NewsPaperStore store = new NewsPaperStore();
        NewsPaper p1 = new NewsPaper(Lang.KANNADA, "smooth", 6, 8, "VijayaKarnataka",
                3, 100, "Hello", "Bye", 12, 30,"Abhi", "Bengluru", InkColor.BLUE, 70);
        NewsPaper p2 = new NewsPaper(Lang.ENGLISH, "medium", 9, 12, "The Hindu",
                4, 120, "Hi", "End", 15, 25,"Raju", "Bengluru", InkColor.BLACK, 100);

        store.save(p1);
        store.save(p2);
        store.findByName("VijayaKarnataka");
        store.displayAll();

        System.out.println(store.findPaperQualityByName("VijayaKarnataka"));

        System.out.println(store.findNoOfPagesByNameAndHeadEditor("VijayaKarnataka", "Abhi"));

        store.updateLangByName("VijayaKarnataka", Lang.HINDI);
    }
}