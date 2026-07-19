package org.example.librarymanagementsystem.service;

import org.springframework.stereotype.Service;
import org.example.librarymanagementsystem.entity.Member;
import org.example.librarymanagementsystem.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;
    public Member addMember(Member member)
        {
        return memberRepository.save(member);
        }
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
    public Member getMemberById(Integer id) {
        return memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Member not found with id: " + id));
    }
    public Member updateMember(Integer id, Member updatedMember) {
        Member member = getMemberById(id);
        member.setName(updatedMember.getName());
        member.setEmail(updatedMember.getEmail());
        member.setPhone(updatedMember.getPhone());
        return memberRepository.save(member);
    }
    public void deleteMember(Integer id) {
        memberRepository.deleteById(id);
    }


}
