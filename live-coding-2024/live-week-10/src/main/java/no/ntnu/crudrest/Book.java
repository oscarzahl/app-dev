package no.ntnu.crudrest;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents a resource: a book. We store Book objects in the application state.
 */
@Entity
public final class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private int year;
  private int numberOfPages;


  public Book() {
  }

  /**
   *
   */
  public Book(int id, String title, int year, int numberOfPages) {
    this.id = id;
    this.title = title;
    this.year = year;
    this.numberOfPages = numberOfPages;
  }

  /**
   * Check if this object is a valid book.
   *
   * @return True if the book is valid, false otherwise
   */
  @JsonIgnore
  public boolean isValid() {
    return title != null && !title.equals("");
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (Book) obj;
    return this.id == that.id &&
        Objects.equals(this.title, that.title) &&
        this.year == that.year &&
        this.numberOfPages == that.numberOfPages;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, year, numberOfPages);
  }

  @Override
  public String toString() {
    return "Book[" +
        "id=" + id + ", " +
        "title=" + title + ", " +
        "year=" + year + ", " +
        "numberOfPages=" + numberOfPages + ']';
  }

}
