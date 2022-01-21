/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dudug
 */
public class Book {

    private String title;
    private int pag;
    private int year;

    public Book(String title, int pag, int year) {
        this.title = title;
        this.pag = pag;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pag + " pages, " + this.year;
    }
}
