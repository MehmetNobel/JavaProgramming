package day_47_Polymorphism;

public class EncapsulationExample {

    private String bookTitle;
    private final String publishDate;

    public EncapsulationExample(String bookTitle, String publishDate) {

        setBookTitle(bookTitle);
        if (publishDate == null) {
            this.publishDate = " ";
        } else {
            this.publishDate = publishDate;

        }

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle == null)
            this.bookTitle = "";
        else
            this.bookTitle = bookTitle;
    }

   /* public void setPublishDate(){   Since publishdate is final ; we cannot reaasign a new value; or set the setter for that
        if(publishDate==null)    //  we can only set the final variables in the constructor.
            this.publishDate="";
        else
            this.publishDate=publishDate;
    }
    */

    @Override
    public String toString() {
        return "EncapsulationExample{" +
                "bookTitle='" + bookTitle + '\'' +
                ", publishDate='" + publishDate + '\'' +
                '}';
    }
}
