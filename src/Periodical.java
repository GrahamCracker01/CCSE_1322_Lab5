//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public class Periodical extends Item{

    private int issueNum;

    //constructors
    public Periodical() {
    }
    public Periodical (String title, int issueNum) {
        setTitle(title);
        this.issueNum = issueNum;
    }
    //getters & setter
    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }
    @Override
    public String getListing() {
        return "Periodical Title - " + getTitle() + "\nIssue # - " + getIssueNum();
    }
}
