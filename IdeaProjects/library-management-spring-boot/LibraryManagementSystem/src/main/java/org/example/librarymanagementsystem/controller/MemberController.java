package org.example.librarymanagementsystem.controller;


import org.example.librarymanagementsystem.entity.Member;
import org.example.librarymanagementsystem.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/members")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }
    @GetMapping
    public List<Member> getMembers() {
        return memberService.getAllMembers();
    }
    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable Integer id) {
        return memberService.getMemberById(id);}
    @PutMapping("/{id}")
    public Member updateMember(@PathVariable Integer id, @RequestBody Member member) {
        return memberService.updateMember(id, member);
    }
    @DeleteMapping("/{id}")
    public String deleteMember(@PathVariable Integer id) {
        memberService.deleteMember(id);
        return "Member deleted with id: " + id;
    }



}
