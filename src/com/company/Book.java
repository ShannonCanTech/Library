package com.company;

public class Book {
    private String title;
    private String author;
    private String yearOfPublication;
    private String isbnNumber;

    public Book() {
    }

    public Book(String title, String author, String yearOfPublication, String isbnNumber) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }
    public String getBookInfo(){
        return "Title: " + getTitle() + '\t' +
                "Author: " + getAuthor() + '\t' +
                "Year of Publication: " + getYearOfPublication() + '\t' +
                "ISBN Number: " + getIsbnNumber() + '\n';
    }
}
