package org.exercise;

public class Book {
    //ATTRIBUTES
    private String title;
    private int numPages;
    private String author;
    private String publisher;

    //CONSTRUCT
    public Book(String title, int numPages, String author, String publisher) throws IllegalArgumentException {
        setTitle(title);
        setNumPages(numPages);
        setAuthor(author);
        setPublisher(publisher);
    }

    //GETTER E SETTER
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author cannot be empty");
        }
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) throws IllegalArgumentException{
        if (numPages <= 0) {
            throw new IllegalArgumentException("Number of pages cannot be equal or minor than 0");
        }
        this.numPages = numPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) throws IllegalArgumentException{
        if (publisher == null || publisher.isEmpty()) {
            throw new IllegalArgumentException("Publisher cannot be empty");
        }
        this.publisher = publisher;
    }

    //Override

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numPages=" + numPages +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}' + "\n";
    }
}
