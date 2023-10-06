public class LibraryItem {

      private  String author;
      private String title;
      private  int year;
     private  boolean isBorrowed;
    private LibraryItemType itemType;

 public LibraryItem(String title, String author, int year, LibraryItemType itemType) {
        }

public LibraryItem(String author, String title, int year, boolean isBorrowed) {
    this.author = author;
    this.title = title;
    this.year = year;
    this.isBorrowed = isBorrowed;
    this.itemType= itemType;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setBorrowed(boolean borrowed) {
            isBorrowed = borrowed;
        }
        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }

        public boolean isBorrowed() {
            return isBorrowed;
        }
    public LibraryItemType getItemType() {
        return itemType;
    }

    public void setItemType(LibraryItemType itemType) {
        this.itemType = itemType;
    }

    //point 6
    @Override
    public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;

     LibraryItem that = (LibraryItem) obj;

        return title.equals(that.title) &&
                author.equals(that.author) &&
                year == that.year &&
                isBorrowed == that.isBorrowed &&
                itemType == that.itemType;
    }

    }





