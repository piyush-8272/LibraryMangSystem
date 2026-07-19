package org.example.librarymanagementsystem.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long bookId;
    @Column(nullable = false,length = 30)
    private String title;
    @Column(nullable = false,length = 50)
    private String author;
    @Column(nullable = false,length = 50, unique = true)
    private String isbn;
    @Column(nullable = false,length = 50)
    private Integer totalCopies;
    @Column(nullable = false,length = 30)
    private Integer availableCopies;

}
