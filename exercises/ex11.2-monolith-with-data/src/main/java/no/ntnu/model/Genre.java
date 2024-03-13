package no.ntnu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * A genre for a book. Entity class.
 */
@Entity
public class Genre {
  @Id
  @GeneratedValue
  private Integer id;
  private String name;

  public Genre() {
  }

  public Genre(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String genre) {
    this.name = genre;
  }
}
