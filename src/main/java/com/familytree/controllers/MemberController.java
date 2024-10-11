package com.familytree.controllers;

import com.familytree.models.Member;
import com.familytree.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}

