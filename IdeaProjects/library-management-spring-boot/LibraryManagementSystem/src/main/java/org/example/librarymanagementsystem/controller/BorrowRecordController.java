package org.example.librarymanagementsystem.controller;


import org.example.librarymanagementsystem.entity.BorrowRecord;
import org.example.librarymanagementsystem.service.BorrowRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/borrow")
public class BorrowRecordController {
    @Autowired
    private BorrowRecordService borrowRecordService;
    @PostMapping("/{bookId}/member/{memberId}")
    public BorrowRecord borrowBook(@PathVariable Integer bookId, @PathVariable Integer memberId) {
        return borrowRecordService.borrowBook(bookId, memberId);
    }
    @PutMapping("/return/{borrowId}")
    public BorrowRecord returnBook(@PathVariable Integer borrowId) {
        return borrowRecordService.returnBook(borrowId);
    }
    @GetMapping
    public List<BorrowRecord> getAllBorrowRecords() {
        return borrowRecordService.getAllBorrowRecords();
    }
    @GetMapping("/{id}")
    public BorrowRecord getBorrowRecordById(@PathVariable Integer id) {
        return borrowRecordService.getBorrowRecordById(id);
    }

}
