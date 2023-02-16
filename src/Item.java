//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public abstract class Item {
    private String title;

    //constructors
    public Item() {
        title = "";
    }

    public Item(String newTitle) {
        title = newTitle;
    }

    //getter & setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract String getListing();

    @Override
    public String toString() {
        return title;
    }


}
