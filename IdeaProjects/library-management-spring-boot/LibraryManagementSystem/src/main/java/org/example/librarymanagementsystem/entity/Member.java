package org.example.librarymanagementsystem.entity;
import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;
    @Column(nullable = false,length = 30)
    private String name;
    @Column(nullable = false,length = 50, unique = true)
    private String email;
    @Column(nullable = false,length = 15)
    private String phone;
    @Column(nullable = false,length = 30)
    private LocalDate membershipDate;
}
