package fr.wcs.workshopEntity.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", length = 255, nullable = false)
    private String title;

    @Column(name = "author", length = 100, nullable = false)
    private String author;

    @Column(name = "release_date", nullable = false)
    private Date releaseDate;

    @ManyToOne
    @JoinColumn(name = "library_id", nullable = true)
    private Library library;

    @ManyToMany()
    @JoinTable(
        name="book_categorie",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns =  @JoinColumn(name = "category_id")
    )
    private List<Category> categories;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
