package com.familytree.services;

import com.familytree.models.Member;
import com.familytree.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
    public Optional<Member> findById(int theid) {
        return memberRepository.findById(theid);
    }

    public Member saveMember(Member theMember) {
        return memberRepository.save(theMember);
    }

}
