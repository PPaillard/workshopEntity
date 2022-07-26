package fr.wcs.workshopEntity.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "title", length = 255, nullable = false)
        private String title;

        @ManyToMany(mappedBy = "categories")
        private List<Book> books;

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

        public List<Book> getBooks() {
                return books;
        }

        public void setBooks(List<Book> books) {
                this.books = books;
        }
}
