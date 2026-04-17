class NewsPaperStore {

    NewsPaper[] papers = new NewsPaper[100];
    int index = 0;

    void save(NewsPaper newsPaper) {
        System.out.println("Saving newspaper...");

        if (newsPaper != null) {
            if (index < papers.length) {
                papers[index] = newsPaper;
                System.out.println("Saved at index: " + index);
                index++;
            }
        } else {
            System.out.println("Null not allowed");
        }
    }

    void saveAll(NewsPaper[] newsPapers) {

        System.out.println("Saving multiple newspapers...");

        if (newsPapers != null) {
            for (int i = 0; i < newsPapers.length; i++) {
                if (newsPapers[i] != null) {
                    save(newsPapers[i]);
                }
            }
        } else {
            System.out.println("Array is null");
        }
    }

    void findByName(String name) {

        System.out.println("Searching newspaper by name: " + name);

        if (name != null) {

            int count = 0;

            for (int i = 0; i < papers.length; i++) {

                if (papers[i] != null) {

                    if (papers[i].name == name) {
                        System.out.println("Match found:");
                        papers[i].display();
                        count++;
                    }
                }
            }

            if (count == 0) {
                System.out.println("Not found");
            }

        } else {
            System.out.println("Name is null");
        }
    }

    void displayAll() {

        System.out.println("Displaying all newspapers...");

        int count = 0;

        for (int i = 0; i < papers.length; i++) {

            if (papers[i] != null) {
                papers[i].display();
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No data");
        }
    }

    String findPaperQualityByName(String name) {

        System.out.println("Finding paper quality for: " + name);

        if (name != null) {

            for (int i = 0; i < papers.length; i++) {

                if (papers[i] != null) {

                    if (papers[i].name == name) {
                        System.out.println("Paper quality found");
                        return papers[i].paperQuality;
                    }
                }
            }

            System.out.println("Not found");
        } else {
            System.out.println("Name is null");
        }

        return null;
    }

    Integer findNoOfPagesByNameAndHeadEditor(String name, String headEditor) {

        System.out.println("Finding pages by Name and Editor: " + name + ", " + headEditor);

        if (name != null && headEditor != null) {

            for (int i = 0; i < papers.length; i++) {

                if (papers[i] != null) {

                    if (papers[i].name == name && papers[i].headEditor == headEditor) {
                        System.out.println("Match found");
                        return papers[i].noOfPages;
                    }
                }
            }

            System.out.println("Not matched");
        } else {
            System.out.println("Null values");
        }

        return null;
    }

    void updateLangByName(String name, Lang newLang) {

        System.out.println("Updating language for: " + name);

        if (name != null && newLang != null) {

            int count = 0;

            for (int i = 0; i < papers.length; i++) {

                if (papers[i] != null) {

                    if (papers[i].name == name) {

                        papers[i].lang = newLang;
                        System.out.println("Updated newspaper:");
                        papers[i].display();
                        count++;
                    }
                }
            }

            if (count == 0) {
                System.out.println("Name not found");
            }

        } else {
            System.out.println("Null input");
        }
    }
}