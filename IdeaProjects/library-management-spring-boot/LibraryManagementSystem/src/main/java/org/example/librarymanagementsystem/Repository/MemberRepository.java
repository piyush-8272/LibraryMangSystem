package org.example.librarymanagementsystem.Repository;

import org.example.librarymanagementsystem.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface MemberRepository extends JpaRepository<Member,Integer> {
}
