package com.familytree.controllers;

import com.familytree.models.Member;
import com.familytree.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MemberController {
    @Autowired
    private MemberService memberService;
    public MemberController(MemberService thMemberDAO) {
        memberService = thMemberDAO;
    }

    @GetMapping("/members")
    public List<Member> members() {
        return memberService.getAllMembers();
    }
    @GetMapping("/members/{membersId}")
    public Optional<Member> getmembers(@PathVariable("membersId") int membersId) {
        Optional<Member> theMember = memberService.findById(membersId);
        if (theMember == null) {
            throw new RuntimeException("Member not found- " + membersId);
        }
        return theMember;
    }
    // add
    @PostMapping("/members")
    public Member addMember(@RequestBody Member theMember) {
        return memberService.saveMember(theMember);
    }
    
}

