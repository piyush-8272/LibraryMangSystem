package org.example.librarymanagementsystem.Repository;

import org.example.librarymanagementsystem.entity.Book;
import org.example.librarymanagementsystem.entity.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, Integer> {
}
