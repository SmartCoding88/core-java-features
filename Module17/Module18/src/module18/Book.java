/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package module18;

/**
 *
 * @author testuser
 */
public class Book {

    String isbnCode;
    String bookName;
    String bookDesc;
    String authorName;
    String subjectName;
    Integer unitsAvailable;

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setUnitsAvailable(Integer unitsAvailable) {
        this.unitsAvailable = unitsAvailable;
    }

    public Book(String isbnCode, String bookName, String bookDesc, String authorName, String subjectName, Integer unitsAvailable) {
        this.isbnCode = isbnCode;
        this.bookName = bookName;
        this.bookDesc = bookDesc;
        this.authorName = authorName;
        this.subjectName = subjectName;
        this.unitsAvailable = unitsAvailable;
    }
    
    public Book(){
        
    }
 }
